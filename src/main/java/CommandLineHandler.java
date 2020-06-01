import org.apache.commons.cli.*;

public class CommandLineHandler {

    private static final String METHOD = "transportation-method";
    private static final String DISTANCE = "distance";
    private static final String DISTANCE_UNIT = "unit-of-distance";
    private static final String OUTPUT_UNIT = "output";

    public static void main(String[] args) {
        CommandLineParser parser = new DefaultParser();
        Options options = prepareOptions();
        try {
            CommandLine commandLine = parser.parse(prepareOptions(), args);
            // Getting required arguments
            String vehicle = commandLine.getOptionValue(METHOD);
            Double distance = ((Number) commandLine.getParsedOptionValue(DISTANCE)).doubleValue();
            // Getting optional arguments
            String distanceUnit="km";
            if(commandLine.hasOption(DISTANCE_UNIT)) {
                distanceUnit = commandLine.getOptionValue(DISTANCE_UNIT);
            }
            String outputUnit=null;
            if (commandLine.hasOption(OUTPUT_UNIT)){
                outputUnit = commandLine.getOptionValue(OUTPUT_UNIT);
            }

            applyArgumentsToCalculator(vehicle,distance,distanceUnit,outputUnit);

        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            new HelpFormatter().printHelp("co2-equivalent-calculator", options);
        }
    }

    private static void applyArgumentsToCalculator(String vehicle, Double distance, String distanceUnit, String outputUnit){
        VehicleFactory vehicleFactory = new VehicleFactory();
        Double factor = vehicleFactory.returnVehicleCO2Factor(vehicle);
        Calculator calculator = new Calculator();
        String result = calculator.calculateEmission(factor, distance, distanceUnit, outputUnit);

        System.out.format("Your trip caused %s of CO2-equivalent.", result);
    }

    private static Options prepareOptions() {
        Options options = new Options();
        options.addOption(getDistanceOption())
                .addOption(getMethodOption())
                .addOption(getDistanceUnitOption())
                .addOption(getOutputOption());
        return options;
    }

    private static Option getMethodOption() {
        return Option.builder().required().desc("REQUIRED transportation method e.g train, bus")
                .longOpt(METHOD)
                .type(Object.class)
                .hasArg()
                .build();
    }

    private static Option getDistanceOption() {
        return Option.builder().required().desc("REQUIRED distance: default value for unit is kilometer (km)")
                .longOpt(DISTANCE)
                .type(Number.class)
                .hasArg()
                .build();
    }

    private static Option getDistanceUnitOption() {
        return Option.builder().desc("accepted units are km and m")
                .longOpt(DISTANCE_UNIT)
                .type(Object.class)
                .hasArg()
                .build();
    }

    private static Option getOutputOption() {
        return Option.builder().desc("output unit: default value for unit is kilogram (kg)")
                .longOpt(OUTPUT_UNIT)
                .type(Object.class)
                .hasArg()
                .build();
    }
}



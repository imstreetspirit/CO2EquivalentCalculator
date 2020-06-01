import java.text.DecimalFormat;

public class Calculator {

    public String calculateEmission(double factor, double distance, String distanceUnit, String outputUnit){

        if("m".equals(distanceUnit)){
            distance = convertMeterToKilometer(distance);
        }
        Double totalAmount = (factor*distance);

        if((totalAmount<1000) && (outputUnit!=null) && ("kg".equals(outputUnit))){
            totalAmount = convertGramToKilogram(totalAmount);
        }
        else if((totalAmount<1000) && ((outputUnit==null))){
            outputUnit = "g";
        }
        else if((totalAmount>1000) && (outputUnit==null)) {
            outputUnit = "kg";
            totalAmount = convertGramToKilogram(totalAmount);
        }
        else if(outputUnit==null) {
            outputUnit = "kg";
        }

        DecimalFormat df = new DecimalFormat("#.#");
        StringBuilder result =new StringBuilder();
        result.append(df.format(totalAmount));
        result.append(outputUnit);
        return result.toString();
    }

    public double convertGramToKilogram(double amount){
        return (amount/1000);

    }

    public double convertKilogramToGram(double amount){
        return (amount*1000);
    }

    public double convertMeterToKilometer(double dist){
        return (dist/1000);
    }

    public double convertKilometerToMeter(double dist){
        return (dist*1000);
    }
}

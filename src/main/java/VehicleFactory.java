public class VehicleFactory {

    public AbstractVehicle getVehicle(String vehicle) {

        String[] tokens = vehicle.split("-", 2);

        if (tokens.length > 1) {
            String model = tokens[1];

            if (model.contains("diesel")) {
                return new DieselCar();
            } else if (model.contains("electric")) {
                return new ElectricCar();
            } else if (model.contains("plugin")) {
                return new PluginHybridCar();
            } else if (model.contains("petrol")) {
                return new PetrolCar();
            }
        } else if (tokens[0].equals("bus")) {
            return new Bus();
        } else if (tokens[0].equals("train")) {
            return new Train();
        }
            return null;
    }

    public Double returnVehicleCO2Factor(String vehicle){

        AbstractVehicle vehicleObject = getVehicle(vehicle);
        Double factor = 0.0;
        String [] tokens = vehicle.split("-",2);

        if (tokens.length > 1){
            String size = tokens[0];
            if("small".equals(size)){
                factor = vehicleObject.returnFactor(SizeEnum.Small);
            }
            else if("medium".equals(size)){
                factor = vehicleObject.returnFactor(SizeEnum.Medium);
            }
            else if("large".equals(size)){
                factor = vehicleObject.returnFactor(SizeEnum.Large);
            }
        }
        else {
            factor = vehicleObject.returnFactor(SizeEnum.Default);
        }
        return factor;
    }
}

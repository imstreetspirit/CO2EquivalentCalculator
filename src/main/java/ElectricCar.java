public class ElectricCar extends Car {

    @Override
    double returnFactor(SizeEnum size) {
        switch (size) {
            case Small:
                return 50;
            case Medium:
                return 58;
            case Large:
                return 73;
            default:
                return 0;
        }
    }
}

public class PetrolCar extends Car {

    @Override
    double returnFactor(SizeEnum size) {
        switch (size) {
            case Small:
                return 154;
            case Medium:
                return 192;
            case Large:
                return 282;
            default:
                return 0;
        }
    }
}

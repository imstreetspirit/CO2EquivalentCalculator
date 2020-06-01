public class DieselCar extends Car{

    @Override
    double returnFactor(SizeEnum size) {
        switch (size){
            case Small:
                return 142;
            case Medium:
                return 171;
            case Large:
                return 209;
            default:
                return 0;
        }

    }

}

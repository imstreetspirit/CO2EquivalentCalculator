public class PluginHybridCar extends Car {

    @Override
    double returnFactor(SizeEnum size) {
        switch (size) {
            case Small:
                return 73;
            case Medium:
                return 110;
            case Large:
                return 126;
            default:
                return 0;
        }
    }
}

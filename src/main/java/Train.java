public class Train extends AbstractVehicle {

    double returnFactor() {
        return 6;
    }

    @Override
    double returnFactor(SizeEnum size) {
        return 6;
    }
}

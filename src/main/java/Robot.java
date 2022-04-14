public class Robot {
    private final int numberOfArms;
    private final int numberOfSensors;

    public Robot(int numberOfArms, int numberOfSensors) {
        this.numberOfArms = numberOfArms;
        this.numberOfSensors = numberOfSensors;
    }

    public int getArms() {
        return numberOfArms;
    }

    public int getSensors() {
        return numberOfSensors;
    }
}

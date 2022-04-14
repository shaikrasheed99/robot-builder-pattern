public class Robot {
    private final int numberOfArms;
    private final int numberOfSensors;
    private final int numberOfLegs;

    public Robot(int numberOfArms, int numberOfSensors, int numberOfLegs) {
        this.numberOfArms = numberOfArms;
        this.numberOfSensors = numberOfSensors;
        this.numberOfLegs = numberOfLegs;
    }

    public int getArms() {
        return numberOfArms;
    }

    public int getSensors() {
        return numberOfSensors;
    }

    public int getLegs() {
        return numberOfLegs;
    }
}

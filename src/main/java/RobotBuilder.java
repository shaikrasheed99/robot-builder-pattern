public class RobotBuilder {
    private int numberOfArms;
    private int numberOfSensors;

    public RobotBuilder withArms(int numberOfArms) {
        this.numberOfArms = numberOfArms;
        return this;
    }

    public RobotBuilder withSensors(int numberOfSensors) {
        this.numberOfSensors = numberOfSensors;
        return this;
    }

    public Robot build() {
        return new Robot(numberOfArms, numberOfSensors);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    void shouldCreateRobotWithTwoArms() {
        Robot robot = new RobotBuilder().withArms(2).build();

        assertEquals(2, robot.getArms());
    }

    @Test
    void shouldCreateRobotWithTenSensors() {
        Robot robot = new RobotBuilder().withSensors(10).build();

        assertEquals(10, robot.getSensors());
    }

    @Test
    void shouldCreateRobotWithTwoLegs() {
        Robot robot = new RobotBuilder().withLegs(2).build();

        assertEquals(2, robot.getLegs());
    }

    @Test
    void shouldCreateRobotWithArmsAndLegsAndSensors() {
        Robot robot = new RobotBuilder().withArms(2).withSensors(10).withLegs(2).build();

        assertEquals(2, robot.getArms());
        assertEquals(10, robot.getSensors());
        assertEquals(2, robot.getLegs());
    }
}

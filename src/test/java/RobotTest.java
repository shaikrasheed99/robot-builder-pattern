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
}

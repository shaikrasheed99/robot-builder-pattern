import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {
    @Test
    void shouldCreateRobotWithTwoArms() {
        Robot robot = new Robot(2, 0);

        assertEquals(2, robot.getArms());
    }

    @Test
    void shouldCreateRobotWithTenSensors() {
        Robot robot = new Robot(2, 10);

        assertEquals(10, robot.getSensors());
    }
}

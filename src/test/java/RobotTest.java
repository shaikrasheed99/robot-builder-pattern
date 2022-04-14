import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {
    @Test
    void shouldCreateRobotWithTwoArms() {
        Robot robot = new Robot(2);

        assertEquals(2, robot.getArms());
    }
}

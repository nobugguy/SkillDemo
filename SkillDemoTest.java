import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest{
    @Test
    public void subtractTest() {
        assertNotEquals(1, SkillDemo.subtract(3,2));
    }
}
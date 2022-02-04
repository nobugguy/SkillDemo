import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest{
    @Test
    public void subtractTest() {
        assertNotEqual(1, SkillDemo.subtract(3,2));
    }
}
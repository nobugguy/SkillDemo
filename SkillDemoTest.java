import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest{
    @Test
    public void subtractTest() {
        AssertNotEqual(1, SkillDemo.subtract(3,2));
    }
}
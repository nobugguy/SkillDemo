import static org.junit.Assert.*;// import JUnit’s Assert class
import org.junit.*;// import JUnit

public class SkillDemoTest{
    @Test
    public void subtractTest() {
        AssertNotEqual(1, SkillDemo.subtract(3,2));
    }
}
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTesting {

    public Calculator cal;

    @Before
    public void initialize(){
        cal = new Calculator();
    }

    @Test
    public void testingAddition(){
        assertEquals(7,cal.addition(3,2));
    }

}

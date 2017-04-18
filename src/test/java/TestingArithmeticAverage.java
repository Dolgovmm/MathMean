import org.junit.Assert;
import org.junit.Test;
import ru.dolgov.mathMean.main.Main;

/**
 * Created by Михалыч on 14.04.2017.
 */

public class TestingArithmeticAverage {
    @Test
    public void testArithmeticAveragedValue(){
        double[] numbers = {1, 2, 3, 4, 5};
        Assert.assertEquals(3.0, Main.calcArithmeticAveragedValue(numbers), 0.01);
    }
}

import org.junit.Assert;
import org.junit.Test;
import ru.dolgov.mathMean.main.Main;

/**
 * Created by Михалыч on 14.04.2017.
 */
public class TestingGeomethricAverage {
    @Test
    public void testGeomethricAveragedValue(){
        double[] numbers = {3, 3, 3};
        Assert.assertEquals(3.0, Main.calcGeomethricAveragedValue(numbers), 0.01);
    }
}

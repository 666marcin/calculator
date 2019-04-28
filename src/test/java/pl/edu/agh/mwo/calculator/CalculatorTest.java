package pl.edu.agh.mwo.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

@Test
    public void testSummary()
{
    Assert.assertEquals(3, calc.sum(1,2));
    Assert.assertEquals(0, calc.sum(10,-10));
    Assert.assertEquals(-50, calc.sum(-70,20));
}
    @Test
    public void testSubtract()
    {
        Assert.assertEquals(3, calc.subtract(5,2));
        Assert.assertEquals(0, calc.subtract(-10,-10));
        Assert.assertEquals(-50, calc.subtract(-70,-20));
        Assert.assertEquals(-30, calc.subtract(70,110));
    }

}

package pl.edu.agh.mwo.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSummary() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.sum(1, 2));
		Assert.assertEquals(0, calculator.sum(10, -10));
		Assert.assertEquals(-50, calculator.sum(-70, 20));
	}

	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(3, calculator.subtract(5, 2));
		Assert.assertEquals(0, calculator.subtract(-10, -10));
		Assert.assertEquals(-50, calculator.subtract(-70, -20));
		Assert.assertEquals(-30, calculator.subtract(70, 110));
	}
}

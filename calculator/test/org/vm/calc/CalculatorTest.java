package org.vm.calc;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

  Calculator calculator;

  @Before
  public void setUp() {
    calculator = new Calculator();
  }

  @Test
  public void testCalculatingSingleNumber() {
    assertEquals(5, calculator.calculate("5"), 0);
  }

  // Now try adding a null check, then addition with "5 + 10", etc
}

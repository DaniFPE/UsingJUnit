package ejemplos.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ejemplos.utils.Calculator;

public class CalculatorTest {
	
	// Prueba del método add()
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    // Prueba del método subtract()
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
    }

    // Prueba del método multiply()
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
    }

    // Prueba del método divide()
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-6, 3));
        
        // Prueba de excepción por división por cero
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
    }

    
}

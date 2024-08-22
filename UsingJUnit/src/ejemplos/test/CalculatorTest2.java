package ejemplos.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;

import org.junit.Test;

import ejemplos.utils.Calculator;

public class CalculatorTest2 {

	/*
	 * La lista completa de aserciones puede ser revisada aqui:
	 * https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
	 * 
	 * Algunas de las más comúnes son:
	 * 	 
	 */
	
	Calculator calculator;

	@Before
	public void inicializar() {
		calculator = new Calculator();
	}

	// Prueba del método add()
	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
		assertEquals(-1, calculator.add(-2, 1));
	}

	// Prueba del método subtract()
	@Test
	public void testSubtract() {
		assertEquals(1, calculator.subtract(3, 2));
		assertEquals(-3, calculator.subtract(-2, 1));
	}

	// Prueba del método multiply()
	@Test
	public void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3));
		assertEquals(-2, calculator.multiply(-1, 2));
	}

	// Prueba del método divide()
	@Test
	public void testDivide() {
		assertEquals(2, calculator.divide(6, 3));
		assertEquals(-2, calculator.divide(-6, 3));

		// Prueba de excepción por división por cero
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.divide(1, 0);
		});
	}

}

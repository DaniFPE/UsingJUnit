package ejemplos.utils;

public class Calculator {

	// Suma dos números
	public int add(int a, int b) {
		return a + b;
	}

	// Resta dos números
	public int subtract(int a, int b) {
		return a - b;
	}

	// Multiplica dos números
	public int multiply(int a, int b) {
		return a * b;
	}

	// Divide dos números
	public int divide(int a, int b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir por cero");
		}
		return a / b;
	}

}

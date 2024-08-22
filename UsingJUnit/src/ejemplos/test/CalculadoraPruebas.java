package ejemplos.test;

import ejemplos.utils.Calculator;

public class CalculadoraPruebas {

	public static void main(String[] args) {
		// Probamos la funcionalidad de los métodos de la calculadora
		
		Calculator calculator = new Calculator();
		
		System.out.println("Resultados de la suma de 4 y 5 es: " + calculator.add(4, 5));
		System.out.println("Resultados de la resta de 4 y 5 es: " + calculator.subtract(4, 5));
		System.out.println("Resultados de la multiplicación de 4 y 5 es: " + calculator.multiply(4, 5));
		System.out.println("Resultados de la division de 4 y 5 es: " + calculator.divide(4, 5));
		
	}

}

package Ex1;

public class Divisão extends Calculadora{
	@Override
	public double Calcular(double num1, double num2) {
		 if (num2 == 0) {
	            throw new ArithmeticException("Divisão por zero não existe.");
	        }
	        return num1 / num2;
		
	}

}

package Ex1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 while(true) {
			 System.out.println("Escolha uma operação: ");
			 System.out.println("1:Adição");
			 System.out.println("2:Subtração");
			 System.out.println("3:Divisão");
			 System.out.println("4: Multiplicação");
			 int escolha=scanner.nextInt();
			 if(escolha==5) {
				 System.out.println("Opção inválida");
				 
				 
			 }
			 System.out.print("Digite o primeiro número: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Digite o segundo número: ");
	            double num2 = scanner.nextDouble();

	            Calculadora operacao = null;
	            switch (escolha) {
                case 1:
                    operacao = new Soma();
                    break;
                case 2:
                    operacao = new Subtração();
                    break;
                case 3:
                    operacao = new Divisão();
                    break;
                case 4:
                    operacao = new Multiplicação();
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    continue;
            }
	            try {
	                double resultado = operacao.Calcular(num1, num2);
	                System.out.println("Resultado: " + resultado);
	            } catch (ArithmeticException e) {
	                System.out.println("Erro: " + e.getMessage());
	            }
	        }
		 
		 }

	}



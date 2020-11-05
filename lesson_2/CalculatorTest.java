import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calculator CalcOne = new Calculator();

		while(true) {

			Scanner scan = new Scanner(System.in);

			System.out.print("Введите первое число:");
			CalcOne.setX(scan.nextInt());
		
			System.out.print("Введите знак математической операции:");
			CalcOne.setMathSymbol(scan.next().charAt(0));
		
			System.out.print("Введите второе число:");
			CalcOne.setY(scan.nextInt());

			CalcOne.calc();
			
			String answer;
			
			do {
				System.out.print("Хотите продолжить ? (yes/no):");
				answer = scan.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
			
			if(answer.equals("yes")) {
			} else {
				break;
			}
		}
	}
}
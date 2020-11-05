public class Calculator {
	private int x; 
	private int y; // числа вводимые пользователем
	private char mathSymbol;
		
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setMathSymbol(char mathSymbol) {
		this.mathSymbol = mathSymbol;
	}

	public void calc() {
		switch(mathSymbol) {
			case '+' :
				System.out.println(x + " " + mathSymbol + " " + y + " = " + (x + y));
				break;
			case '-' :
				System.out.println(x + " " + mathSymbol + " " + y + " = " + (x - y));
				break;
			case '%' :
				System.out.println(x + " " + mathSymbol + " " + y + " = " + (x % y));
				break;
			case '*' :
				System.out.println(x + " " + mathSymbol + " " + y + " = " + (x * y));
				break;
			case '/' :
				System.out.println(x + " " + mathSymbol + " " + y + " = " + ((double)x / y));
				break;
			case '^' :
				long result = x;
				for (int i = 1; i < y; i++) {
					result *= x;
				}
				System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
				break;
			default :
					System.out.println("Введите корректный знак");			
			}
		}
}
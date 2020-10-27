public class Calculator {
	public static void main(String[] args) {
		long x = 10; 
		long y = 11; // числа вводимые пользователем
		char mathSymbol = '/';
		long result;
		
		if (mathSymbol == '%') {
			result = x % y;
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		} else if (mathSymbol == '+') {
			result = x + y;
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		} else if (mathSymbol == '-') {
			result = x - y;
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		} else if (mathSymbol == '*') {
			result = x * y;
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		} else if (mathSymbol == '/') {
			System.out.println(x + " " + mathSymbol + " " + y + " = " + (double)x / (double)y);
		} else if (mathSymbol == '^' && y > 0) {
			result = x;
			for (int i = 1; i < y; i++) {
				result *= x;
			}
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		}
	}
}
public class Calculator {
	public static void main(String[] args) {
		long x = 10; 
		long y = 11; // числа вводимые пользователем
		char z = '^' ; // z - знак
		long result; // результат математического выражения
		if (z == '%') {
			result = x % y;
			System.out.println(x + " " + z + " " + y + " = " + result);
		} else if (z == '+') {
			result = x + y;
			System.out.println(x + " " + z + " " + y + " = " + result);
		} else if (z == '-') {
			result = x - y;
			System.out.println(x + " " + z + " " + y + " = " + result);
		} else if (z == '*') {
			result = x * y;
			System.out.println(x + " " + z + " " + y + " = " + result);
		} else if (z == '/') {
			double y1 = y;
			double result1 = x / y1;
			System.out.println(x + " " + z + " " + y + " = " + result1);
		} else if (z == '^' && y > 0) {
			result = x;
			for (int i = 1; i < y; i++) {
				result = result * x;
			}
			System.out.println(x + " " + z + " " + y + " = " + result);
		}
	}
}
public class Cycle {
	public static void main(String[] args) {
		
		int i = 0;
		while(i <= 20) {
			System.out.println(i);
			i++;
		}

		int g = 6;
		while(g >= -6) {
			System.out.println(g);
			g-=2;
		}

		int e = 11;
		int sum = 0;
		do {
			sum = sum + e;
			e+=2;
		} while(e < 20);
		System.out.println(sum);


	}
}
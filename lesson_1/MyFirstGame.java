public class MyFirstGame {
	public static void main(String[] args) {
		System.out.println("Угадайте число!");
		int randomNumber = 26;
		int userNumber = 14;
		do {
			if (randomNumber > userNumber) {
				System.out.println("Введеное вами число = " + userNumber);
				System.out.println("Нет, число компьютера больше!");
				userNumber += 10;
			} else if (randomNumber < userNumber) {
				System.out.println("Введеное вами число = " + userNumber);
				System.out.println("Нет, число компьютера меньше!");
				userNumber--;
			}
		} while (randomNumber != userNumber);
		System.out.println("Вы угадали! " + "Компьютер загадал число " + randomNumber);	
	}
}
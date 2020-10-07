public class ConditionalStatement {
	public static void main(String[] args) {
	int age = 26;
	boolean manGender = true;
	float height = 1.70f;
	char firstNameLetter = 'E';

	if(age > 20) {
		System.out.println("мне больше двадцати, мне " + age);
	}
	
	if(manGender) {
		System.out.println("Я мужчина");
	}
	
	if(!manGender) {
		System.out.println("Я не мужчина");
	}

	if(height < 1.80) {
		System.out.println("Я небольшого роста, " + "мой рост " + height);
	} else {
		System.out.println("У меня высокий рост, " + "мой рост " + height);
	 }

	if(firstNameLetter == 'M') {
		System.out.println("Мое имя начинается с буквы M");
	} else if(firstNameLetter == 'I') {
		System.out.println("Мое имя начинается с буквы I");
	} else {
		System.out.println("Меня зовут Женя, приятно познакомиться!");
	}

	}
}
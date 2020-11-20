package com.startjava.lesson_1.cs;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 26;
		if(age > 20) {
			System.out.println("мне больше двадцати, мне " + age);
		}

		boolean manGender = true;
		if(manGender) {
			System.out.println("Я мужчина");
		}
	
		if(!manGender) {
			System.out.println("Я не мужчина");
		}
		
		float height = 1.70f;
		if(height < 1.80) {
			System.out.println("Я небольшого роста, " + "мой рост " + height);
		} else {
			System.out.println("У меня высокий рост, " + "мой рост " + height);
	 	}
		
		char firstNameLetter = 'E';
		if(firstNameLetter == 'M') {
			System.out.println("Мое имя начинается с буквы M");
		} else if(firstNameLetter == 'I') {
			System.out.println("Мое имя начинается с буквы I");
		} else {
			System.out.println("Меня зовут Женя, приятно познакомиться!");
		}
	}
}
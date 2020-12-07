package com.startjava.lesson_2_3_4.other;

public class WolfTest {
	public static void main(String[] args) {
		Wolf WolfBo = new Wolf();

		WolfBo.setName("Bo");
		WolfBo.setColor("grey");
		WolfBo.setWeight(5);
		WolfBo.setAge(1);
		WolfBo.setGender("male");

		System.out.println("Кличка = " + WolfBo.getName());
		System.out.println("Окрас = " + WolfBo.getColor());
		System.out.println("Возраст = " + WolfBo.getAge());
		System.out.println("Вес = " + WolfBo.getWeight());
		System.out.println("Пол = " + WolfBo.getGender());

		WolfBo.go();
		WolfBo.sit();
		WolfBo.run();
		WolfBo.howl();
		WolfBo.hunt();
	}
}
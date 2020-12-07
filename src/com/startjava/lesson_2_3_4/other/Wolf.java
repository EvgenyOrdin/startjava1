package com.startjava.lesson_2_3_4.other;

public class Wolf {

	private String gender;
	private String name;
	private String color;
	private int age;
	private int weight;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void go() {
		System.out.println(name + " Идет");
	}
	
	public void sit() {
		System.out.println(name + " Сидит");
	}

	public void run() {
		System.out.println(name + " Бежит");
	}

	public void howl() {
		System.out.println(name + " Воет");
	}

	public void hunt() {
		System.out.println(name + " Охотится");
	}
}
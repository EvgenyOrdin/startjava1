package com.startjava.lesson_2_3.robot;


public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger("Черно Альфа", "Mark-1", "Россия", 2.412f, 85.34f, 10, "'Кулаки Тесла'");
		Jaeger jaeger2 = new Jaeger("Молчаливый Ронин", "Mark-1", "Япония", 7.450f, 74.37f, 3, "'Ручные лезвия'");
		
		System.out.println(jaeger1);
		
		jaeger1.useWeapon();

		System.out.println(jaeger2);
		
		jaeger2.useWeapon();
	}
}
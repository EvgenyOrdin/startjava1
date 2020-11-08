public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		Jaeger jaeger2 = new Jaeger();
		
		jaeger1.setName("Черно Альфа");
		jaeger1.setMark("Mark-1");
		jaeger1.setOrigin("Россия");
		jaeger1.setWeight(2.412f);
		jaeger1.setHeight(85.34f);
		jaeger1.setWeapon("Кулаки Тесла");
		jaeger1.setArmor(10);

		System.out.println(jaeger1);
		
		jaeger1.useWeapon();

		jaeger2.setName("Молчаливый Ронин");
		jaeger2.setMark("Mark-1");
		jaeger2.setOrigin("Япония");
		jaeger2.setWeight(7.450f);
		jaeger2.setHeight(74.37f);
		jaeger2.setWeapon("Ручные лезвия");
		jaeger2.setArmor(3);

		System.out.println(jaeger2);
		
		jaeger2.useWeapon();
	}
}
public class Jaeger {
	
	private String name;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int armor;
	private String weapon;

	public Jaeger(String name, String mark, String origin, float weight, float height, int armor, String weapon) {
		this.name = name;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.armor = armor;
		this.weapon = weapon;
	}

	public void useWeapon() {
		System.out.println(name + " использует " + weapon);
	}
	
	public String toString() {
		return "Техническая информация : " + "\nИмя - " + name  + "\nСерия - " + mark  + "\nСтрана производитель - " + origin  + "\nВес - " + weight  + "\nВысота - " + height  + "\nКласс брони - " + armor;
	}
}
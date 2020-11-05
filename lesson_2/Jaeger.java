public class Jaeger {
	
	private String name;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int armor;
	private String weapon;

	public String getName() {
		return name;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		return origin;
	}

	public String getWeapon() {
		return weapon;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getArmor() {
		return armor;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void useWeapon() {
		System.out.println(name + " использует " + weapon);
	}

	public void jaegerInfo() {
		System.out.println(" ");
		System.out.println("Техническая информация :");
		System.out.println("Имя - " + name);
		System.out.println("Серия - " + mark);
		System.out.println("Страна производитель - " + origin);
		System.out.println("Вес - " + weight);
		System.out.println("Высота - " + height);
		System.out.println("Класс брони - " + armor);
		System.out.println(" ");
	}
}
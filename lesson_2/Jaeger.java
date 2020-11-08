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

	public void setName(String name) {
		this.name = name;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getArmor() {
		return armor;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void useWeapon() {
		System.out.println(name + " использует " + weapon);
	}
	
	public String toString() {
		return "Техническая информация : " + "\nИмя - " + name  + "\nСерия - " + mark  + "\nСтрана производитель - " + origin  + "\nВес - " + weight  + "\nВысота - " + height  + "\nКласс брони - " + armor;
	}
}
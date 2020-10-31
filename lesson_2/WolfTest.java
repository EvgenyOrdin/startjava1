public class WolfTest {
	public static void main(String[] args) {
		Wolf WolfBo = new Wolf();
		WolfBo.nameWolf = "Bo";
		WolfBo.colorWolf = "grey";
		WolfBo.weightWolf = 5;
		WolfBo.ageWolf = 1;
		WolfBo.genderWolf = "Male";

		System.out.println("Кличка = " + WolfBo.nameWolf);
		System.out.println("Окрас = " + WolfBo.colorWolf);
		System.out.println("Возраст = " + WolfBo.ageWolf);
		System.out.println("Вес = " + WolfBo.weightWolf);
		System.out.println("Пол = " + WolfBo.genderWolf);

		WolfBo.go();
		WolfBo.sit();
		WolfBo.run();
		WolfBo.howl();
		WolfBo.hunt();
	}
}

public class Main {

	public static void main(String[] args) {
		String text = "Today, the weather is great.";
		String newText = text.substring(0, 2);
		String newText2 = giveCity();
		System.out.println(newText);
		System.out.println(newText2);

		int number = addition(5, 7);
		System.out.println(number);

		int result = addition2(2, 4, 5, 7, 7);
		System.out.println(result);

	}

	public static void add() {

	}

	public static void delete() {

	}

	public static void update() {

	}

	public static String giveCity() {
		return "İstanbul";
	}

	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

	public static int addition2(int... numbers) {
		int result = 0;
		for (int number : numbers) {
			result = result + number;
		}
		return result;

	}

}

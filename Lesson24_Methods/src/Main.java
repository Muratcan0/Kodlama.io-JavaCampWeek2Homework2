
public class Main {

	public static void main(String[] args) {
		findNumber();

	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int wanted = 5;
		boolean exist = false;
		String message = "";

		for (int number : numbers) {
			if (number == wanted) {
				exist = true;
				break;
			}
		}
		if (exist) {
			message = wanted + " is exist in the list.";

		} else {
			message = wanted + " is not exist in the list.";
		}
		giveMessage(message);

	}

	public static void giveMessage(String message) {
		System.out.println(message);

	}

}

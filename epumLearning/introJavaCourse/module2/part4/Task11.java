package epam_learning.module2.part4;

public class Task11 {

	/**
	 * Написать метод(методы), определяющий, в каком из данных двух чисел больше
	 * цифр
	 */
	public static void main(String[] args) {

		int firstDigit = 88;
		int secondDigit = 9;

		moreDigits(firstDigit, secondDigit);

	}

	public static void moreDigits(int a, int b) {

		int counter1 = 0;
		int counter2 = 0;
		counter1 = countDigits(a);
		counter2 = countDigits(b);

		if (counter1 > counter2) {
			System.out.print("First number has more digits than second");
		} else if (counter1 < counter2) {
			System.out.print("Second number has more digits than first");
		} else {
			System.out.print("The same quantity");
		}

	}

	public static int countDigits(int digit) {

		int counter = 0;

		while (Math.pow(10, counter) <= digit) {
			counter++;
		}

		return counter;
	}

}

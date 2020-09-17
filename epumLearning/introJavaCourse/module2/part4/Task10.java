package epam_learning.module2.part4;

public class Task10 {

	/**
	 * Дано натуральное число N. Написать метод(методы) для формирования массива,
	 * элементами которого являются цифры числа N
	 */
	public static void main(String[] args) {

		int digit = 1000;

		splitDigit(digit);

	}

	public static int[] splitDigit(int digit) {

		int counter = 0;

		while (Math.pow(10, counter) <= digit) {
			counter++;
		}

		int[] mas = new int[counter];

		for (int i = 0; i < counter; i++) {
			mas[i] = (digit / (int) (Math.pow(10, counter - 1 - i))) % 10;
			System.out.println(mas[i]);
		}
		
		return mas;
	}

}

package epam_learning.module2.part4;

public class Task14 {

	/**
	 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
	 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
	 * числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
	 */
	public static void main(String[] args) {

		int k = 500000;

		armstrongNumbers(k);

	}

	public static void armstrongNumbers(int k) {

		int sum;

		for (int i = 1; i <= k; i++) {
			sum = sumOfPowOfArray(i);
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}

	public static int countDigits(int digit) {

		int counter = 0;

		while (Math.pow(10, counter) <= digit) {
			counter++;
		}

		return counter;
	}

	public static int[] splitDigit(int digit) {

		int counter = 0;

		counter = countDigits(digit);

		int[] mas = new int[counter];

		for (int i = 0; i < counter; i++) {
			mas[i] = (digit / (int) (Math.pow(10, counter - 1 - i))) % 10;

		}

		return mas;
	}

	public static int sumOfPowOfArray(int number) {

		int sum = 0;
		int n = 0;
		int[] mas;
		mas = splitDigit(number);
		n = mas.length;

		for (int i = 0; i < mas.length; i++) {
			sum += Math.pow(mas[i], n);
		}

		return sum;
	}

}

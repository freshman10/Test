package epam_learning.module2.part4;

public class Task15 {

	/**
	 * Найти все натуральные n-значные числа, цифры в которых образуют строго
	 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
	 * использовать декомпозицию.
	 */
	public static void main(String[] args) {

		int n = 6;

		sequence(n);
	}

	public static void sequence(int n) {

		int num;

		for (int i = 1; i < 10; i++) {
			num = i;
			while (countDigits(num) < n & (num % 10) != 9) {
				num = num * 10 + (num % 10) + 1;
				if (countDigits(num) == n) {
					System.out.println(num);
				}
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
}

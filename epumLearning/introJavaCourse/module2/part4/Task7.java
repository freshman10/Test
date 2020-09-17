package epam_learning.module2.part4;

public class Task7 {
	/*
	 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
	 * от 1 до 9.
	 */

	public static void main(String[] args) {

		System.out.print(oddFactorial());

	}

	public static int oddFactorial() {

		int sum = 1;

		for (int i = 1; i < 10; i += 2) {
			sum *= i;
		}
		return sum;
	}
}

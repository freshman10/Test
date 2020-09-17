package epam_learning.module2.part4;

public class Task13 {

	/**
	 * Два простых числа называются «близнецами», если они отличаются друг от друга
	 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
	 * [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
	 * использовать декомпозицию.
	 */
	public static void main(String[] args) {

		int n = 40;

		twins(n);
	}

	public static void twins(int n) {

		for (int i = n; i <= 2 * n - 2; i++) {
			System.out.println(i + " " + (i + 2));
		}
	}
}

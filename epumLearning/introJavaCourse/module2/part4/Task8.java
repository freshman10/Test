package epam_learning.module2.part4;

public class Task8 {
	/*
	 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] +
	 * D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления
	 * суммы трех последовательно расположенных элементов массива с номерами от k до
	 * m
	 */

	public static void main(String[] args) {

		int[] d = { 1, 2, 3, 4, 5, 6 };

		System.out.println(sums(d, 1, 3));
		System.out.println(sums(d, 3, 5));
		System.out.println(sums(d, 4, 6));
	}

	public static int sums(int[] mas, int k, int m) {

		int sum = 0;
		int tmp = 0;

		if (k > m) {
			tmp = m;
			m = k;
			k = tmp;
		}

		for (int i = k - 1; i <= m - 1; i++) {
			sum += mas[i];
		}

		return sum;
	}
}

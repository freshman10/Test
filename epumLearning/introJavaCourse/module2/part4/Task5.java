package epam_learning.module2.part4;

public class Task5 {
	/*
	 * Составить программу, которая в массиве A[N] находит второе по величине число
	 * (вывести на печать число, которое меньше максимального элемента массива, но
	 * больше всех других элементов).
	 */
	public static void main(String[] args) {

		int[] mas = { 2, 0, 1, 0, 2 };

		secondMax(mas);

	}

	public static void secondMax(int[] a) {

		int max;
		max = a[0];
		int secondMax;
		secondMax = a[1];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				secondMax = max;
				max = a[i];
			} else if (secondMax < a[i] & a[i] < max) {
				secondMax = a[i];
			}
		}

		System.out.print(secondMax);
	}

}
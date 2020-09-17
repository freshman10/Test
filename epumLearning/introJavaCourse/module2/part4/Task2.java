package epam_learning.module2.part4;

public class Task2 {
	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
	 * натуральных чисел.
	 */

	public static void main(String[] args) {

		int a = 80;
		int b = 20;
		int c = 60;
		int d = 40;

		System.out.print(nodFourDigits(a, b, c, d));
	}

	public static int nod(int a, int b) {

		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		while (a - b != 0) {
			a = a - b;
			if (a < b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
		}

		return b;
	}

	public static int nodFourDigits(int a, int b, int c, int d) {

		return nod(d, nod(c, nod(a, b)));
	}

}

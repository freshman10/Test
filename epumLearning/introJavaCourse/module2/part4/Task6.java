package epam_learning.module2.part4;

public class Task6 {
	/*
	 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно
	 * простыми.
	 */

	public static void main(String[] args) {

		int a = 8;
		int b = 3;
		int c = 11;

		simpleDigits(a, b, c);

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
	

	public static void simpleDigits(int a, int b, int c) {

		if (nod(a, b) == 1 & nod(b, c) == 1 & nod(a, c) == 1) {
			System.out.print("Digits are simple");
		} else {
			System.out.print("Digits arn't simple");
		}
	}

}
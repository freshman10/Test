package epam_learning.module2.part4;

public class Task1 {
	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя и
	 * наименьшего общего кратного двух натуральных чисел: HOK(A,B) =
	 * (A*B)/(HOD(A*B))
	 */

	public static void main(String[] args) {

		int A = 15;
		int B = 20;

		System.out.print(nok(A, B));
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

	public static int nok(int a, int b) {

		return (a * b) / nod(a, b);
	}
}

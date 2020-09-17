package epam_learning.module2.part4;

public class Task12 {

	/**
	 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
	 * элементами которого являются числа, сумма цифр которых равна К и которые не
	 * большее N.
	 */
	public static void main(String[] args) {

		int k = 43;
		int n = 5;

		generateArray(k, n);

	}

	public static int[] generateArray(int k, int n) {

		if (n == 0) {
			System.out.print("Error, n = 0");
			return new int[0];
		}

		int dim = 0;
		int i = 0;
		dim = k / n;

		if (k % n != 0) {
			dim++;
		}

		int[] mas = new int[dim];

		while (i < dim) {
			if (dim - i == 1 & k % n != 0) {
				mas[i] = k % n;
			} else {
				mas[i] = n;
			}
			System.out.print(mas[i] + " ");
			i++;
		}

		return mas;
	}
}

package epam_learning.module2.part4;

class Task16 {

	/**
	 * Написать программу, определяющую сумму n - значных чисел, содержащих только
	 * нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
	 * решения задачи использовать декомпозицию.
	 * 
	 */
	public static void main(String[] args) {

		int n = 2;

		sum(n);
	}

	public static int generateNDigitNumber(int n) {
		// This function creates a number with n-ones

		int i = 1;
		int number = 1;

		while (i < n) {
			number = (int) Math.pow(10, i) + number;
			i++;
		}

		return number;
	}

	public static void sum(int n) {

		int sum = 0;
		int first_number;
		first_number = generateNDigitNumber(n);

		for (int i = first_number; i < Math.pow(10, n); i += 2) {
			if (isDigitsOdd(i) == 0) {
				// System.out.print(i + " ");
				sum += i;
			}
		}

		System.out.println(String.format("Sum all of %d-digits number with odd digits = ", n) + sum);
		System.out.println("Quantity of even digits in sum = " + isDigitsOdd(sum));

	}

	public static int isDigitsOdd(int number) {

		int counter = 0;
		int n;
		n = getLength(number);
		for (int i = 0; i < n; i++) {
			if (((number / (int) Math.pow(10, i)) % 10) % 2 == 0) {
				counter++;
			}
		}
		return counter;

	}

	public static int getLength(int number) {

		int n = 0;

		while (number >= Math.pow(10, n)) {
			n++;
		}

		return n;
	}

}

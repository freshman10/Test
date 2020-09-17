package epam_learning.module2.part4;

public class Task17 {

	/**
	 * . Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму
	 * его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
	 * Для решения задачи использовать декомпозицию.
	 */
	public static void main(String[] args) {
		
		int number = 111;
		int counter = 0;
		
		while (Math.abs(number)!=0) {
			number = decreaseBySumOfDigits(Math.abs(number));
			counter++;
		}
		
		System.out.print(counter);
		
	}
	
	public static int decreaseBySumOfDigits(int number) {
		
		int n ;
		n = getLength(number);
		int [] arrOfDigits = new int[n];
		arrOfDigits = splitDigit(number);
		int sum = 0;
		
		for(int digit:arrOfDigits) {
			sum+= digit;
		}
		
		return number - sum;
		
	}
	
	public static int getLength(int number) {

		int n = 0;

		while (number >= Math.pow(10, n)) {
			n++;
		}

		return n;
	}
	
	public static int[] splitDigit(int digit) {

		int counter = 0;

		counter = getLength(digit);

		int[] mas = new int[counter];

		for (int i = 0; i < counter; i++) {
			mas[i] = (digit / (int) (Math.pow(10, counter - 1 - i))) % 10;

		}

		return mas;
	}

}

package epam_learning.module2.part3;

public class Task8 {
	/*
	 * Даны дроби (p1/q1,p2/q2,...,pn/qn) ( pi qi , - натуральные). Составить
	 * программу, которая приводит эти дроби к общему знаменателю и упорядочивает их
	 * в порядке возрастания.
	 */
	public static void main(String[] args) {

		int[] numerator = { 2, 1, 2, 1,3 };
		int[] denumerator = { 4, 2, 3, 1,9 };
		int answerNum = 0;
		int answerDenum = 1;
		int currentNod = 1;

		if (denumerator.length != numerator.length) {
			System.out.println("Error.");
			return;
		}

		denumerator = sort(denumerator, numerator)[0];
		numerator = sort(denumerator, numerator)[1];

		for (int i = 0; i < denumerator.length; i++) {

			if (denumerator[i] == 0) {
				System.out.print("Division by zero.Remove all zeros from denumerator,please");
				return;
			}

			System.out.print(numerator[i] + " \\ " + denumerator[i] + "\n");
			currentNod = nod(answerDenum, denumerator[i]);
			answerNum = answerNum * (denumerator[i] / currentNod) + numerator[i] * (answerDenum / currentNod);
			answerDenum = answerDenum * denumerator[i] / currentNod;
		}

		System.out.println("Общий знаменатель: " + answerNum + " \\ " + answerDenum);
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

	public static int[][] sort(int[] arr, int[] arr2) {

		int step = 0;
		int size = arr.length;
		int tmp_id = 0;
		int tmp = 0;
		int tmp2 = 0;

		for (step = size / 2; step > 0; step /= 2) {
			for (int i = step; i < size; i++) {
				if (i - step >= 0) {
					tmp = arr[i];
					tmp2 = arr2[i];
					tmp_id = i - step;
					while (tmp_id >= 0) {
						if (arr[tmp_id] > tmp) {
							arr[tmp_id + step] = arr[tmp_id];
							arr2[tmp_id + step] = arr2[tmp_id];
							tmp_id -= step;
						} else {
							break;
						}
					}
					arr[tmp_id + step] = tmp;
					arr2[tmp_id + step] = tmp2;
				}
			}
		}

		return new int[][] { arr, arr2 };
	}
}

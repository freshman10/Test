package epam_learning.module2.part3;

public class Task6 {
	/*
	 * Сортировка массива по возрастанию методом Шелла
	 */
	public static void main(String[] args) {

		int[] arr = { -14, 23, 1, -50, 2, 6, 8, 9, -1, 1, 1, 2, 0, 3, -20 };
		int step = 0;
		int size = arr.length;
		int tmp_id = 0;
		int tmp = 0;

		for (step = size / 2; step > 0; step /= 2) {
			for (int i = step; i < size; i++) {
				if (i - step >= 0) {
					tmp = arr[i];
					tmp_id = i - step;
					while (tmp_id >= 0) {
						if (arr[tmp_id] > tmp) {
							arr[tmp_id + step] = arr[tmp_id];
							tmp_id -= step;
						} else {
							break;
						}
					}
					arr[tmp_id + step] = tmp;
				}
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}

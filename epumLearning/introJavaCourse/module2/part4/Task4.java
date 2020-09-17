package epam_learning.module2.part4;

public class Task4 {
	/*
	 * На плоскости заданы своими координатами n точек. Написать метод(методы),
	 * определяющие, между какими из пар точек самое большое расстояние. Указание.
	 * Координаты точек занести в массив.
	 */
	public static void main(String[] args) {

		int[][] mas = { { 1, 1 }, { 5, 4 }, { 7, -1 }, { 0, 0 }, { -2, -2 } };

		System.out.print(biggestDistance(mas));

	}

	public static double distance(int[] a, int[] b) {

		return Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2));
	}

	public static double biggestDistance(int[][] mas) {

		double maxDist = 0;
		double currentDist = 0;

		for (int i = 0; i < mas.length - 1; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				currentDist = distance(mas[i], mas[j]);
				if (currentDist > maxDist) {
					maxDist = currentDist;
				}
			}
		}
		return maxDist;

	}
}

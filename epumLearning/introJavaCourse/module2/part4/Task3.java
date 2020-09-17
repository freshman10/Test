package epam_learning.module2.part4;

public class Task3 {
	/*
	 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
	 * вычисления площади треугольника.
	 */
	public static void main(String[] args) {

		int a = 5;

		System.out.print(squareOfHexagon(a));
	}

	public static double squareOfTriangle(int a) {

		return (Math.sqrt(3) / 4) * a * a;
	}

	public static double squareOfHexagon(int a) {

		return squareOfTriangle(a) * 6;
	}
}

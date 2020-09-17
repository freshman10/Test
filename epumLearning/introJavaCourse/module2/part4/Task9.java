package epam_learning.module2.part4;

public class Task9 {
	/*
	 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
	 * вычисления его площади, если угол между сторонами длиной X и Y— прямой
	 */
	public static void main(String[] args) {

		double x = 2;
		double y = 4;
		double z = 5;
		double t = 8;

		System.out.print(square(x, y, z, t));

	}

	public static double square(double a, double b, double c, double d) {

		double s1 = 0;
		double s2 = 0;
		double hypotenuse = 0;

		s1 = rightTriangleSquare(a, b);
		hypotenuse = hypotenuse(a, b);
		s2 = squareOfTriangle(hypotenuse, c, d);

		return s1 + s2;

	}

	public static double rightTriangleSquare(double a, double b) {

		return (1 / 2.0) * a * b;
	}

	public static double hypotenuse(double a, double b) {

		return Math.sqrt(a * a + b * b);
	}

	public static double squareOfTriangle(double a, double b, double c) {

		double perimetr = 0;
		double square = 0;

		perimetr = (a + b + c) / 2.0;
		square = Math.sqrt(perimetr * (perimetr - a) * (perimetr - b) * (perimetr - c));

		return square;
	}

}

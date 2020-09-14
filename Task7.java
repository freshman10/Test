package epam_learning.module2.part3;

public class Task7 {
	/*
	 * Пусть даны две неубывающие последовательности действительных чисел a1 <= a2,
	 * ...,<= an и b1 <= b2 ,...,<= bm . Требуется указать те места, на которые
	 * нужно вставлять элементы последовательности b1 <= b2 ,...,<= bm в первую
	 * последовательность так, чтобы новая последовательность оставалась
	 * возрастающей.
	 * 
	 */
	public static void main(String[] args) {

		int[] masA = { 5, 6, 9, 10, 80,84 };
		int[] masB = { 0, 0, 5, 10, 15, 18,90,91 };
		int id = 0;

		for (int i = 0; i < masA.length; i++) {
			while (id < masB.length ) {
				if(masA[i] >= masB[id]) {
				System.out.println("\"" + masB[id] + "\"" + " insert before " + (i + 1) + " element in massive A");
				id++;
				}else {
					break;
				}
			}
			while (i + 1 == masA.length & id < masB.length) {
				System.out.println("\"" + masB[id] + "\"" + " insert after " + (i + 1) + " element in massive A");
				id++;

			}
		}

	}
}

package by.jonline.basic.part_3;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {

	public static void main(String[] args) {
		long n = 1;
		
		long k;
		for (int i = 2; ; i++) {
			k = n * (i * i);
			
			// смотрим переполнение
			if (k / (i * i) == n) {
				 n = k;
			} else {
				break;
			}
		}

		System.out.println("Максимальное число n = " + n);

	}

}

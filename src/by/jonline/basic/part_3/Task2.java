package by.jonline.basic.part_3;

// 2. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task2 {

	public static void main(String[] args) {
		double a = -2.5;
		double b = 6.0;
		double h = 1.3;
		
		double y;
		
		for (double x = a; x <= b; x += h) {
			y = x > 2 ? x : -x;
			
			System.out.println("y = " + y);
		}

	}

}

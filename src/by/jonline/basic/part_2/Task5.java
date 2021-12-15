package by.jonline.basic.part_2;

// 5. Вычислить значение функции:

public class Task5 {

	public static void main(String[] args) {
		double f;
		double x = 4.4;
		
		f = (x <= 3) ? (x * x - 3 * x + 9) : (1 / (Math.pow(x, 3) + 6));
		
		System.out.println("f(x) = " + f);
	}

}

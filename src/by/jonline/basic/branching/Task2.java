package by.jonline.basic.branching;

// 2. Найти max{min(a, b), min(c, d)}.

public class Task2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		int max;
		
		max = Math.max(Math.min(a, b), Math.min(c, d));
		
		System.out.println("max = " + max);
	}

}

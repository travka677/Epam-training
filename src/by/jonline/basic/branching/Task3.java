package by.jonline.basic.branching;

// 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task3 {

	public static void main(String[] args) {
		// A
		double x1 = 3.3;
		double y1 = 7.78; 
		
		// B
		double x2 = 1.0;
		double y2 = 12.1; 
		
		// C
		double x3 = 19.9;
		double y3 = 0.0; 
		
		// уравнение прямой
		if ((x1-x3)/(x2-x3) == (y1-y3)/(y2-y3)) {
			System.out.println("Будут");
		} else {
			System.out.println("Не будут");
		}
	
	}

}

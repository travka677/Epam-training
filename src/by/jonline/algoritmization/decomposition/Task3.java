package by.jonline.algoritmization.decomposition;

// 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task3 {

	public static void main(String[] args) {
		
		double a = 5;
		
		System.out.println(hexagonArea(a));

	}
	
	public static double hexagonArea(double a) {
		
		return 3 * Math.pow(a, 2) * Math.sqrt(3) / 2;
	}

}

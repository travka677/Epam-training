package by.jonline.algoritmization.decomposition;

// 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
// если угол между сторонами длиной X и Y— прямой.

public class Task9 {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 5.0;
		double z = 6.0;
		double t = 8.0;
		
		System.out.println("S = " + area(x, y, z, t));

	}
	
	// 1. Вычислим площадь прямоугольного треугольника
	// 2. Найдем диагональ прямоугольника(гипотенуза) зная x и y
	// 3. Вычислим площадь второго треугольника по формуле Герона
	// 4. Сложим площади двух треугольников
	
	public static double area(double x, double y, double z, double t) {
		
		double area;
		double s1;
		double d1;
		double p;
		double s2;
		
		s1 = x * y / 2;
		d1 = Math.sqrt(x*x + y*y);
		p = (d1 + t + z) / 2;
		s2 = Math.sqrt(p * (p-d1) * (p-z) * (p-t));
		area = s1 + s2;
		
		return area;
		
	}

}

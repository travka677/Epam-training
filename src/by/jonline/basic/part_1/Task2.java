package by.jonline.basic.part_1;

// 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task2 {

	public static void main(String[] args) {
		double a = 3.4;
		double b = 4.1;
		double c = 5.67;
		
		double res;
		
		res = b + Math.sqrt(b*b + 4*a*c);
		res /= (2 * a);
		res -= Math.pow(a, 3) * c;
		res += Math.pow(b, -2);
		
		System.out.println("res = " + res);
	}

}

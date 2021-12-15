package by.jonline.basic.part_1;

// 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task3 {

	public static void main(String[] args) {
		double x = 6.7;
		double y = 60.0;
		
		double res;
		
		res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * (Math.sin(x*y) / Math.cos(x*y));
		
		System.out.println("res = " + res);

	}

}

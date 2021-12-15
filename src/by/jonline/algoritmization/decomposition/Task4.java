package by.jonline.algoritmization.decomposition;

// 4. На плоскости заданы своими координатами n точек. 
// Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. 
// Указание. Координаты точек занести в массив.

public class Task4 {

	public static void main(String[] args) {
		
		double[][] points = { {2, 5}, {-3, 12}, {8.7, -4}, {1.3, 4.3} };
		
		print(compare(points));

	}
	
	
	public static double[][] compare(double[][] points) {
		
		double max;
		int x = 0;
		int y = 1;
		
		max = Math.sqrt(Math.pow(points[x][0] - points[x][0], 2) + Math.pow(points[y][1] - points[y][1], 2));
		
		for (int i = 0; i < points.length; i++) {
			
			for (int j = i + 1; j < points.length; j++) {
				
				double d = Math.sqrt(Math.pow(points[j][0] - points[i][0], 2) + Math.pow(points[j][1] - points[i][1], 2));
				
				if (d > max) {
					max = d;
					x = i;
					y = j;
				}
			}
			
		}

		double[][] point = { {points[x][0], points[x][1]}, {points[y][0], points[y][1]} };
		
		return point;
	}
	
	public static void print(double[][] point) {
		
		for (int i = 0; i < point.length; i++) {
			
			for (int j = 0; j < point[i].length; j++) {
				System.out.println(point[i][j]);
			}
			System.out.println();
		}
	}

}

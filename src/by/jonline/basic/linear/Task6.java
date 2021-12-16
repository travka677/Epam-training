package by.jonline.basic.linear;

// 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае: 

public class Task6 {

	public static void main(String[] args) {
		// наша точка
		int x = 0;
		int y = -1;
		
		// прямоугольник
		int x1 = -4;
		int x2 = 4;
		int y1 = -3;
		int y2 = 0;
		
		// квадрат
		int x3 = -2;
		int x4 = 2;
		int y3 = -3;
		int y4 = 4;
		
		// проверим по очереди прямоугольник и квадрат
		boolean res;
		
		res = (x >= x1 && x <= x2 && y >= y1 && y <= y2) || (x >= x3 && x <= x4 && y >= y3 && y <= y4);
		
		System.out.println(res);

	}

}

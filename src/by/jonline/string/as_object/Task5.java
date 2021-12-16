package by.jonline.string.as_object;

// 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {

	public static void main(String[] args) {
		
		String str = "baba deda";
		
		System.out.println(str);
		System.out.println(count(str, 'a'));
		
	}
	
	public static int count(String str, char ch) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		
		return count;
	}

}

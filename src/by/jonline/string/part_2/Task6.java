package by.jonline.string.part_2;

// 6. Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {

	public static void main(String[] args) {
		
		String str = "baba deda";
		
		System.out.println(str);
		System.out.println(format(str));
	}
	
	public static String format(String str) {
		
		StringBuilder newStr = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			newStr.append(str.charAt(i));
			newStr.append(str.charAt(i));
		}
		
		return newStr.toString();
	}

}

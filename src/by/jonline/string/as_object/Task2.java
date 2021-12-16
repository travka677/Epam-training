package by.jonline.string.as_object;

// 2. В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {

	public static void main(String[] args) {
		
		String str = "baba deda";
		
		System.out.println(format(str));
	}
	
	public static String format(String str) {
		
		StringBuilder builder = new StringBuilder(str);
		
		for (int i = 0; i < builder.length(); i++) {
			if (builder.charAt(i) == 'a') {
				builder.insert(i + 1, 'b');
			}
		}
		
		return builder.toString();
	}

}

package by.jonline.string.as_object;

// 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено 
// "abc cde def", то должно быть выведено "abcdef".

public class Task7 {

	public static void main(String[] args) {
		
		String str = "  abc cde def";
		
		System.out.println(str);
		System.out.println(format(str));
	}
	
	public static String format(String str) {
		
		if (str.length() == 0) {
			return "";
		}
		
		StringBuilder newStr = new StringBuilder();
		
		int index = 0;
		
		while (index < str.length()) {
			if (str.charAt(index) != ' ') {
				newStr.append(str.charAt(index));
				break;
			}
			index++;
		}
		
		boolean flag = false;
		
		for (int i = index; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch != ' ') {
				for (int j = 0; j < newStr.length(); j++) {
					flag = true;
					if (ch == newStr.charAt(j)) {
						flag = false;
						break;
					} 
				}
				if (flag) {
					newStr.append(ch);
				}
			}
		}
		
		return newStr.toString();
	}

}

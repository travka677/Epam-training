package by.jonline.string.as_array;

// 4. В строке найти количество чисел

public class Task4 {

	public static void main(String[] args) {
		
		String str = "0efjwi016 99j800900";
		
		System.out.println(countNumbers(str));

	}
	
	public static int countNumbers(String str) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			// числа не могут начинаться с 0
			if (ch == '0') {
				i++;
				while (i < str.length() && isDigit(str.charAt(i))) {
					i++;
				}
			}
			
			if (i < str.length() - 1 && isDigit(str.charAt(i)) && isDigit(str.charAt(i + 1))) {
				count++;
				i++;
				while (i < str.length() && isDigit(str.charAt(i))) {
					i++;
				}
			} 
		}
		
		return count;
	}
	
	public static boolean isDigit(char ch) {
		
		char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == ch) {
				return true;
			}
		}
		
		return false;
	}

}

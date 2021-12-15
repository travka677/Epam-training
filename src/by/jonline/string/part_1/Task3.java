package by.jonline.string.part_1;

// 3. В строке найти количество цифр.

public class Task3 {

	public static void main(String[] args) {
		
		String str = "efjwi45iod0 t211r5";
		
		System.out.println(countDigits(str));
	}
	
	public static int countDigits(String str) {
		
		char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		int count = 0; 
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int j = 0; j < digits.length; j++) {
				if (ch == digits[j]) {
					count++;
				}
			}
		}
		
		return count;
	}

}

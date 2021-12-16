package by.jonline.string.as_array;

// 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. 
// Крайние пробелы в строке удалить.

public class Task5 {

	public static void main(String[] args) {

        String str = " helo   hi  privet zdraste     ";
        System.out.println(str);
        System.out.println(format(str));


    }

    public static String format(String str) {

        int n = endsAt(str);
        int m = startsAt(str);
        int length = n - (m - 1) - countExtraSpaces(str);

        char[] newStr = new char[length];

        int index = 0;

        for (int i = m; i <= n; i++, index++) {
            newStr[index] = str.charAt(i);
            if (str.charAt(i) == ' ') {
                while (i <= n && str.charAt(i + 1) == ' ') {
                    i++;
                }
            }
        }

        return String.valueOf(newStr);
    }

    public static int countExtraSpaces(String str) {

        int count = 0;
        int n = startsAt(str);
        int m = endsAt(str);

        for (int i = n + 1; i <= m; i++) {
            if (str.charAt(i) == ' ') {
                while (i <= m && str.charAt(i + 1) == ' ') {
                    count++;
                    i++;
                }
            }
        }

        return count;
    }

    public static int startsAt(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                return i;
            }
        }
        return str.length() - 1;
    }

    public static int endsAt(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                return i;
            }
        }
        return 0;
    }

}

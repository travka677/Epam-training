package by.jonline.algoritmization.decomposition;

import java.util.Arrays;

// 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task16 {

	public static void main(String[] args) {

        int n = 2;

        if (n > 0 && n <= 10) {
        	int[] numbers =  create(n);
            
            System.out.println(Arrays.toString(numbers));
            System.out.println("sum = " + sum(numbers));
            System.out.println("Кол-во четных цифр - " + countEvenDigits(sum(numbers)));
        } else {
        	System.out.println("Некорректные данные");
        }
        

    }

    public static int[] create(int n) {

        int[] numbers = new int [10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * (Math.pow(10, n) - Math.pow(10, n-1)) + Math.pow(10, n-1));
        }

        return numbers;
    }

    public static int sum(int[] numbers) {

        int sum = 0;
        boolean isOdd = true;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = numbers[i]; j > 0; j /= 10) {
                if ((j % 10) % 2 == 0) {
                    isOdd = false;
                    break;
                }
            }
            if (isOdd) {
                sum += numbers[i];
            }
            isOdd = true;

        }

        return sum;
    }
    
    public static int countEvenDigits(int n) {
    	
    	int count = 0;
    	
    	for (int i = n; i > 0; i /= 10) {
    		if ((i % 10) % 2 == 0) {
    			count++;
    		}
    	}
    	
    	return count;
    }

}

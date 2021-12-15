package by.jonline.algoritmization.part_2;

// 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, 
// составленная из чисел 1, 2, 3, ..., n2 так, что суммы по каждому столбцу, каждой строке и 
// каждой из двух больших диагоналей равны между собой. Построить такой квадрат.

// дичь дикая

public class Task16 {

	public static void main(String[] args) {

		int n = 3;

		int[][] magicSquare = createMagicSquare(n);
		Task4.print(magicSquare);
	}

	// построение магического квадрата для нечетных порядков
	public static int[][] createMagicSquare(int n) {

        int[][] magicSquare = new int[n][n];

        int col = 0;
        int row = n / 2;
        
        // переменные для запоминания позиции прошлого числа
        int ind1;
        int ind2;

        // ставим сначала 1 
        int i = 1;
        magicSquare[col][row] = i;

        while (i < n * n) {
            i++;
            ind1 = col;
            ind2 = row;
            
            // правило 1
            col--;
            row++;

            if (col >= 0 && col < n && row < n && row >= 0) {
            	// если место занято, ставим значение под числом
                if (magicSquare[col][row] != 0) {
                    col = ++ind1;
                    row = ind2;
                }
                magicSquare[col][row] = i;
                continue;
            
            // выход за верхнюю границу
            } else if (col < 0) {
            	// выход за верхнюю и правую границы
                if (row >= n) {
                    col = ind1 + 1;
                    row = ind2 - 1;
                } else {
                    col = n - 1;
                    row = ind2 + 1;
                }

            // выход за правую границу
            } else if (row >= n) {
                col = ind1 - 1;
                row = 0;
            }
            
            // если место занято, ставим значение под числом
            if (magicSquare[col][row] != 0) {
                col = ++ind1;
                row = ind2;
            }
            magicSquare[col][row] = i;
        }
        
        return magicSquare;

    }
}

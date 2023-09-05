import java.util.Scanner;

public class MatrixDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }

        boolean isMatriksDiagonal = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && matriks[i][j] != 0) {
                    isMatriksDiagonal = false;
                    break;
                }
                if (i == j && matriks[i][j] == 0) {
                    isMatriksDiagonal = false;
                    break;
                }
            }
        }

        if (isMatriksDiagonal) {
            System.out.println("matriks diagonal");
        } else {
            System.out.println("bukan matriks diagonal");
        }
    }
}

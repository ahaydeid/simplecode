import java.util.Scanner;

public class Sepuluh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }

        boolean isMatriksNol = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriks[i][j] != 0) {
                    isMatriksNol = false;
                    break;
                }
            }
        }

        if (isMatriksNol) {
            System.out.println("matriks nol");
        } else {
            System.out.println("bukan matriks nol");
        }
    }
}

import java.util.Scanner;

public class Sebelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriks[i][j] = scanner.nextInt();
            }
        }

        boolean isMatriksSimetris = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriks[i][j] != matriks[j][i]) {
                    isMatriksSimetris = false;
                    break;
                }
            }
        }

        if (isMatriksSimetris) {
            System.out.println("matriks simetris");
        } else {
            System.out.println("bukan matriks simetris");
        }
    }
}

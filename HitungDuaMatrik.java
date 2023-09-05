import java.util.Scanner;

public class HitungDuaMatrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriksA = new int[3][3];
        int[][] matriksB = new int[3][3];
        int[][] hasil = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriksA[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriksB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
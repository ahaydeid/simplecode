import java.util.Scanner;

public class PolaBDanK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        
        int[][] pola = new int[B][K];
        int count = 1;
        
        for (int j = 0; j < K; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < B; i++) {
                    pola[i][j] = count;
                    count++;
                }
            } else {
                for (int i = B - 1; i >= 0; i--) {
                    pola[i][j] = count;
                    count++;
                }
            }
        }
        
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < K; j++) {
                System.out.print(pola[i][j]);
                if (j < K - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

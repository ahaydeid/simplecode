import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int angka = 1 << i;
            for (int j = 0; j <= i; j++) {
                System.out.print(angka);
                if (j < i) {
                    System.out.print(" ");
                }
                angka /= 2;
            }
            System.out.println();
        }
    }
}

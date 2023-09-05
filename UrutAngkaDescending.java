import java.util.Scanner;

public class UrutAngkaDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] angka = new int[3];

        for (int i = 0; i < 3; i++) {
            angka[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (angka[i] < angka[j]) {
                    int temp = angka[i];
                    angka[i] = angka[j];
                    angka[j] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}

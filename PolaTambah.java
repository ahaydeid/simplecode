import java.util.Scanner;

public class PolaTambah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sukuPertama = scanner.nextInt();
        int[] barisanBilangan = new int[15];

        for (int i = 0; i < 15; i++) {
            barisanBilangan[i] = sukuPertama;
            sukuPertama += 3;
            sukuPertama += i % 3; // Pola penambahan +4, +5 bergantian
        }

        for (int bilangan : barisanBilangan) {
            System.out.print(bilangan + " ");
        }
    }
}

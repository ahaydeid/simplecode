import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bilangan1 = scanner.nextInt();
        int bilangan2 = scanner.nextInt();
        int bilangan3 = scanner.nextInt();

        int terbesar = bilangan1;

        if (bilangan2 > terbesar) {
            terbesar = bilangan2;
        }
        if (bilangan3 > terbesar) {
            terbesar = bilangan3;
        }

        System.out.println(terbesar);
    }
}

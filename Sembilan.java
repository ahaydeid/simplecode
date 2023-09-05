import java.util.Scanner;

public class Sembilan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bilangan;
        int cek = 0;

        bilangan = scanner.nextInt();

        if (bilangan % 3 == 0 && bilangan % 4 == 0) {
            cek = 1;
        }

        System.out.println(cek);
    }
}

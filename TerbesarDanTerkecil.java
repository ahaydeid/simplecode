import java.util.Scanner;

public class TerbesarDanTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();

        int terbesar = cariTerbesar(angka1, angka2);
        int terkecil = cariTerkecil(angka1, angka2);

        System.out.println(terbesar + " " + terkecil);
    }

    public static int cariTerbesar(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int cariTerkecil(int a, int b) {
        return (a < b) ? a : b;
    }
}

import java.util.Scanner;

public class KPK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int kpk = hitungKPK(a, b);

        System.out.println(kpk);
    }

    public static int hitungKPK(int a, int b) {
        return (a * b) / hitungFPB(a, b);
    }

    public static int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

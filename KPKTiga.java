import java.util.Scanner;

public class KPKTiga {
    public static int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int hitungKPK(int a, int b) {
        return a * (b / hitungFPB(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int kpk_AB = hitungKPK(A, B);
        int kpk_ABC = hitungKPK(kpk_AB, C);

        System.out.println(kpk_ABC);
    }
}

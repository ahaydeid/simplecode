import java.util.Scanner;

public class FPBTiga {
    public static int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int fpb_AB = hitungFPB(A, B);
        int fpb_ABC = hitungFPB(fpb_AB, C);

        System.out.println(fpb_ABC);
    }
}

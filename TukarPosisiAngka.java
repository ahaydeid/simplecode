import java.util.Scanner;

public class TukarPosisiAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();

        tukarNilai(angka1, angka2);
    }

    public static void tukarNilai(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}

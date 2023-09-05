import java.util.Scanner;

public class KaliDuaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();

        int hasilPerkalian = hitungPerkalian(angka1, angka2);

        System.out.println(hasilPerkalian);
    }

    public static int hitungPerkalian(int a, int b) {
        return a * b;
    }
}

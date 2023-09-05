import java.util.Scanner;

public class DesimalKeRomawi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desimal = scanner.nextInt();

        if (desimal >= 1 && desimal <= 4000) {
            String romawi = konversiKeRomawi(desimal);
            System.out.println(romawi);
        }
    }

    public static String konversiKeRomawi(int num) {
        String[] simbolRomawi = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };

        int[] nilaiRomawi = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < nilaiRomawi.length; i++) {
            while (num >= nilaiRomawi[i]) {
                hasil.append(simbolRomawi[i]);
                num -= nilaiRomawi[i];
            }
        }

        return hasil.toString();
    }
}

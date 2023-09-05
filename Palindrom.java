import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();

        String[] kata = kalimat.split(" ");
        int jumlahPalindrom = 0;

        for (String k : kata) {
            if (isPalindrom(k)) {
                jumlahPalindrom++;
            }
        }

        System.out.println(jumlahPalindrom);
    }

    public static boolean isPalindrom(String kata) {
        int left = 0;
        int right = kata.length() - 1;

        while (left < right) {
            if (kata.charAt(left) != kata.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

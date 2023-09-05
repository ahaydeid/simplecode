import java.util.Scanner;

public class BinerKeDesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String biner = scanner.nextLine();

        int desimal = konversiBinerKeDesimal(biner);

        System.out.println(desimal);
    }

    public static int konversiBinerKeDesimal(String biner) {
        int panjang = biner.length();
        int desimal = 0;

        for (int i = 0; i < panjang; i++) {
            int digit = biner.charAt(i) - '0';
            desimal = (desimal << 1) + digit;
        }

        return desimal;
    }
}

import java.util.Scanner;

public class TigaBerpasangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        String hurufPertama = scanner.nextLine().toLowerCase();
        String hurufKedua = scanner.nextLine().toLowerCase();
        String hurufKetiga = scanner.nextLine().toLowerCase();

        int count = countTriplets(text, hurufPertama, hurufKedua, hurufKetiga);
        System.out.println(count);
    }

    public static int countTriplets(String text, String hurufPertama, String hurufKedua, String hurufKetiga) {
        int count = 0;

        for (int i = 0; i < text.length() - 2; i++) {
            String temp = text.substring(i, i + 3);
            if (temp.equals(hurufPertama + hurufKedua + hurufKetiga)) {
                count++;
            }
        }

        return count;
    }
}

import java.util.Scanner;

public class DesimalKeBiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desimal = scanner.nextInt();
        String biner = konversiKeBiner(desimal);
        System.out.println(biner);
    }

    public static String konversiKeBiner(int desimal) {
        if (desimal == 0) {
            return "0";
        }

        String biner = "";
        while (desimal > 0) {
            int sisa = desimal % 2;
            biner = sisa + biner;
            desimal /= 2;
        }

        return biner;
    }
}

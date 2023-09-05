import java.util.Scanner;

public class DesimalKeOktal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desimal = scanner.nextInt();
        String oktal = konversiKeOktal(desimal);
        System.out.println(oktal);
    }

    public static String konversiKeOktal(int desimal) {
        if (desimal == 0) {
            return "0";
        }

        String oktal = "";
        while (desimal > 0) {
            int sisa = desimal % 8;
            oktal = sisa + oktal;
            desimal /= 8;
        }

        return oktal;
    }
}

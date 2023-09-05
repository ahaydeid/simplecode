import java.util.Scanner;

public class DesimalKeHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desimal = scanner.nextInt();

        String heksadesimal = konversiDesimalKeHeksadesimal(desimal);

        System.out.println(heksadesimal);
    }

    public static String konversiDesimalKeHeksadesimal(int desimal) {
        StringBuilder heksadesimal = new StringBuilder();

        while (desimal > 0) {
            int sisa = desimal % 16;
            char digitHeks = (sisa < 10) ? (char) ('0' + sisa) : (char) ('A' + sisa - 10);
            heksadesimal.insert(0, digitHeks);
            desimal /= 16;
        }

        return heksadesimal.toString();
    }
}

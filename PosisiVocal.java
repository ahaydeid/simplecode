import java.util.Scanner;

public class PosisiVocal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[3][3];
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            String[] characters = line.split(" ");
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = characters[j].charAt(0);
            }
        }

        boolean adaVocal = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = matrix[i][j];
                if (isVocal(c)) {
                    adaVocal = true;
                    System.out.println(c + ": (" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }

        if (!adaVocal) {
            System.out.println("tidak ada huruf vokal");
        }
    }

    public static boolean isVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

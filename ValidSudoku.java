import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] blok = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                blok[i][j] = scanner.nextInt();
            }
        }

        boolean isValid = cekValid(blok);

        if (isValid) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    }

    public static boolean cekValid(int[][] blok) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (set.contains(blok[i][j])) {
                    return false;
                }
                set.add(blok[i][j]);
            }
        }

        return true;
    }
}

import java.util.Scanner;

public class UbahJadiAlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kalimat = scanner.nextLine();

        String kalimatAlay = convertToAlay(kalimat);
        System.out.println(kalimatAlay);
    }

    public static String convertToAlay(String kalimat) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < kalimat.length(); i++) {
            char currentChar = kalimat.charAt(i);

            switch (currentChar) {
                case 'A':
                case 'a':
                    result.append('4');
                    break;
                case 'I':
                case 'i':
                    result.append('1');
                    break;
                case 'Z':
                case 'z':
                    result.append('2');
                    break;
                case 'E':
                case 'e':
                    result.append('3');
                    break;
                case 'G':
                case 'g':
                    result.append('6');
                    break;
                case 'J':
                case 'j':
                    result.append('7');
                    break;
                case 'B':
                case 'b':
                    result.append('8');
                    break;
                default:
                    result.append(currentChar);
                    break;
            }
        }

        return result.toString();
    }
}

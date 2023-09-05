import java.util.Scanner;

public class JumlahJenisHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int[] charCount = new int[26];
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                }
                int index = c - 'a';
                charCount[index]++;
            }
        }
        
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}

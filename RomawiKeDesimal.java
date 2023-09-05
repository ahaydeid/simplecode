import java.util.HashMap;
import java.util.Scanner;

public class RomawiKeDesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String romawi = scanner.nextLine();

        int desimal = konversiRomawiKeDesimal(romawi);
        System.out.println(desimal);
    }

    public static int konversiRomawiKeDesimal(String romawi) {
        HashMap<Character, Integer> romawiKeAngka = new HashMap<>();
        romawiKeAngka.put('I', 1);
        romawiKeAngka.put('V', 5);
        romawiKeAngka.put('X', 10);
        romawiKeAngka.put('L', 50);
        romawiKeAngka.put('C', 100);
        romawiKeAngka.put('D', 500);
        romawiKeAngka.put('M', 1000);

        int hasil = 0;
        int n = romawi.length();
        int nilaiAwal = 0;

        for (int i = n - 1; i >= 0; i--) {
            int temp = romawiKeAngka.get(romawi.charAt(i));
            
            if (temp >= nilaiAwal) {
                hasil += temp;
            } else {
                hasil -= temp;
            }

            nilaiAwal = temp;
        }

        return hasil;
    }
}

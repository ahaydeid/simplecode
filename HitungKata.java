import java.util.Scanner;

public class HitungKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        
        // Menggunakan split() untuk memisahkan kata-kata berdasarkan spasi
        String[] kataArr = kalimat.split(" ");
        
        // Menghitung jumlah kata dalam kalimat
        int jumlahKata = kataArr.length;
        
        System.out.println(jumlahKata);
    }
}

import java.util.*;

public class SangJuara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nCatur = scanner.nextInt();
        Set<String> juaraCatur = new HashSet<>();
        for (int i = 0; i < nCatur; i++) {
            String nama = scanner.next();
            juaraCatur.add(nama);
        }

        int nBadminton = scanner.nextInt();
        Set<String> juaraBadminton = new HashSet<>();
        for (int i = 0; i < nBadminton; i++) {
            String nama = scanner.next();
            juaraBadminton.add(nama);
        }

        List<String> juaraDuaCabang = new ArrayList<>();
        for (String nama : juaraCatur) {
            if (juaraBadminton.contains(nama)) {
                juaraDuaCabang.add(nama);
            }
        }

        Collections.sort(juaraDuaCabang, Collections.reverseOrder());

        if (juaraDuaCabang.isEmpty()) {
            System.out.println("tidak ada sang juara");
        } else {
            for (String nama : juaraDuaCabang) {
                System.out.println(nama);
            }
        }
    }
}

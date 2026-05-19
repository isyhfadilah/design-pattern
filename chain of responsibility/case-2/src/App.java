import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int option;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah hari pengajuan cuti: ");
        option = sc.nextInt();

        if (option > 0 && option <= 3) {
            System.out.println("Cuti disetujui oleh Supervisor");
        } else if (option > 3 && option <= 7) {
            System.out.println("Cuti disetujui oleh Manager");
        } else if (option > 7) {
            System.out.println("Cuti disetujui oleh HRD");
        } else {
            System.out.println("Jumlah hari cuti tidak valid");
        }
    }
}

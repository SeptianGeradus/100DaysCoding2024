import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        LocalTime waktuSekarang = LocalTime.now();
        String salam;

        if (waktuSekarang.isBefore(LocalTime.NOON)) {
            salam = "Selamat pagi";
        } else if (waktuSekarang.isBefore(LocalTime.of(17, 0))) {
            salam = "Selamat siang";
        } else {
            salam = "Selamat malam";
        }

        System.out.println("══════════════════════════════════════════");
        System.out.printf("      %s, %s%n", salam, nama);
        System.out.println("      Program Anda Telah Selesai");
        System.out.println("══════════════════════════════════════════");
        System.out.println("════════════");
    }
}

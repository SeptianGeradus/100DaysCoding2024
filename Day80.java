import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String input = sc.nextLine();

        System.out.println("String sebelum dipangkas: '" + input + "'");

        String a = input.trim();

        System.out.println("String setelah dipangkas: '" + a + "'");

    }
}

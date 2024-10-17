public class Negasi_kebalikan{
    public static void main(String[] args) {
        int a = 12;
        int b = 8;

        boolean kondisi  = (a != b);
        boolean negasiKondisi = !kondisi;

        System.out.println("Apakah a tidak sama dengan b? " + kondisi);
        System.out.println("Negasi dari kondisi tersebut: " + negasiKondisi);
    }
}

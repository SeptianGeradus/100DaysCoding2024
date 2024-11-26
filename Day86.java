public class main {
    public static void main(String[] args) {
       int[] angka = {1, 2, 3, 4, 5};

      System.out.println("Isi Array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen ke-" + (i+1) + ": " + angka[i]);
        }
    }
}

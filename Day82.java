public class Main {
    public static void main(String[] args) {
        
        double angka = 7.3;

        double ceilValue = Math.ceil(angka);
        System.out.println("Hasil Math.ceil(" + angka + ") = " + ceilValue);

        double floorValue = Math.floor(angka);
        System.out.println("Hasil Math.floor(" + angka + ") = " + floorValue);

        long roundValue = Math.round(angka);
        System.out.println("Hasil Math.round(" + angka + ") = " + roundValue);
    }
}

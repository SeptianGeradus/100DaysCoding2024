public class main {
    public static void main(String[] args) {
      
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Array sebelum perubahan:");
     
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int indeksYangInginDiubah = 2;  
        int nilaiBaru = 100;         
        array[indeksYangInginDiubah] = nilaiBaru;
        System.out.println("Array setelah diubah :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
 

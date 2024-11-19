class Mahasiswa {
    private String nama;
    private int umur;
  
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public String toString() {
        return "Mahasiswa{nama='" + nama + "', umur=" + umur + "}";
    }
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Septian", 18);
        
    System.out.println(mahasiswa);
    }
}

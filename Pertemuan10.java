public class Pertemuan10 {

    //Soal 1
    static void cetakGaris() {
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    //Soal 2
    static void tampilkanMahasiswa(String nama, String nim, double ipk) {
        System.out.println("data mahasisaw");
        System.out.println("nama : " + nama);
        System.out.println("nim  : " + nim);
        System.out.println("ipk  : " + ipk);
    }

    //Soal 3
    static void cetakTabel(int angka) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }

    public static void main(String[] args) {

        // Soal 1
        cetakGaris();
        cetakGaris();
        cetakGaris();

        // Soal 2
        tampilkanMahasiswa("Bagas", "123456", 3.85);

        // Soal 3
        cetakTabel(3);
    }
}
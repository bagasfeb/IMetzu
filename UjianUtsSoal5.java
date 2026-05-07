import java.util.Scanner;

public class UjianUtsSoal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahData;

        // Input jumlah data minimal 5
        do {
            System.out.print("Masukkan jumlah data yang kamu mau (minimal 5): ");
            jumlahData = input.nextInt();

            if (jumlahData < 5) {
                System.out.println("Jumlahnya data harus minimal 5 !!!!!!!!!!!!\n");
            }

        } while (jumlahData < 5);

        // Membuat array 1 dimensi
        int[] data = new int[jumlahData];

        // Input data ke array
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("masukin nilai datanya ke-" + (i + 1) + " : ");
            data[i] = input.nextInt();
        }

        // Menentukan nilai terendah
        int nilaiTerendah = data[0];
        int indeksTerendah = 0;

        // Membandingkan setiap nilai
        for (int i = 1; i < jumlahData; i++) {
            if (data[i] < nilaiTerendah) {
                nilaiTerendah = data[i];
                indeksTerendah = i;
            }
        }

        // Menampilkan hasil
        System.out.println("\n----- HASIL NILAI -----");
        System.out.println("Hasil dari nilai terendahnya = " + nilaiTerendah);
        System.out.println("posisi indeks array kamuuu= " + indeksTerendah);

        input.close();
    }
}
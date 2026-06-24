import java.util.Scanner;

public class Pertemuan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kategori = {"Anak", "Dewasa", "Lansia"};
        int[] harga = {10000, 20000, 15000};

        int pilih, jumlah = 0, hargaTiket = 0;

        do {
            System.out.println("\ntiket");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar");
            System.out.print("pilih Menu: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    for (int i = 0; i < kategori.length; i++) {
                        System.out.println((i + 1) + ". " + kategori[i] + " = Rp" + harga[i]);
                    }

                    System.out.print("Pilih kategori: ");
                    int k = input.nextInt();
                    hargaTiket = harga[k - 1];
                    break;

                case 2:
                    System.out.print("Jumlah tiket: ");
                    jumlah = input.nextInt();
                    break;

                case 3:
                    int total = jumlah * hargaTiket;
                    System.out.println("Total Bayar = Rp" + total);
                    break;

            }

        } while (pilih != 4);

        input.close();
    }
}
public class pertemuan9 {

    // Soal 1
    static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // Soal 2
    static boolean isGanjil(int angka) {
        return angka % 2 != 0;
    }

    // Soal 3
    static int getNilaiMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        // Soal 1
        System.out.println("Luas = " + hitungLuas(5, 4));

        // Soal 2
        System.out.println("5 ganjil? " + isGanjil(5));
        System.out.println("8 ganjil? " + isGanjil(8));

        // Soal 3
        int[] nilai = {70, 85, 90, 65, 88};
        System.out.println("Nilai terbesar = " + getNilaiMax(nilai));
    }
}
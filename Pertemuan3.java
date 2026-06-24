import java.util.Scanner;

public class Pertemuan3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan IPS: ");
        double ips = input.nextDouble();

        int sksmaks;

        if (ips >= 3.50) {
            sksmaks = 24;
        } else if (ips >= 3.00) {
            sksmaks = 22;
        } else if (ips >= 2.00) {
            sksmaks = 20;
        } else {
            sksmaks = 18;
        }

        System.out.println("IPS Mahasiswa : " + ips);
        System.out.println("SKS Maksimal  : " + sksmaks);

        input.close();
    }
}
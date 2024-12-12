import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> totalBiaya = new ArrayList<>();

        while (true) {
            System.out.println("Pilih paket hamper:");
            System.out.println("1. 2 Kue kering dan 3 Kue Basah (Rp 150.000)");
            System.out.println("2. 3 Kue Kering dan 2 Kue Basah (Rp 175.000)");
            System.out.println("3. 3 Kue Kering dan 3 Kue Basah (Rp 200.000)");
            System.out.print("Masukan pilihan hampers [1/2/3]: ");
            int pilihanHamper = scanner.nextInt();

            System.out.println("Pilih paket packing:");
            System.out.println("1. Pita (Rp 50.000)");
            System.out.println("2. Kartu (Rp 75.000)");
            System.out.println("3. Pita + Kartu (Rp 125.000)");
            System.out.print("Masukan pilihan packing [1/2/3]: ");
            int pilihanPacking = scanner.nextInt();

            double total = hitungTotalBiaya(pilihanHamper, pilihanPacking);
            totalBiaya.add(total);

            System.out.print("Input lagi (Y/N)?: ");
            String jawaban = scanner.next();
            if (jawaban.equalsIgnoreCase("N")) {
                break;
            }
        }

        double totalBayar = hitungTotalBayar(totalBiaya);
        System.out.println("Total hamper yang dipesan = " + totalBiaya.size());
        System.out.println("Total yang harus dibayar = Rp " + totalBayar);
    }

    public static double hitungTotalBiaya(int pilihanHamper, int pilihanPacking) {
        double hargaHamper = 0;
        double hargaPacking = 0;

        switch (pilihanHamper) {
            case 1:
                hargaHamper = 150000;
                break;
            case 2:
                hargaHamper = 175000;
                break;
            case 3:
                hargaHamper = 200000;
                break;
        }

        switch (pilihanPacking) {
            case 1:
                hargaPacking = 50000;
                break;
            case 2:
                hargaPacking = 75000;
                break;
            case 3:
                hargaPacking = 125000;
                break;
        }

        return hargaHamper + hargaPacking;
    }

    public static double hitungTotalBayar(ArrayList<Double> totalBiaya) {
        double totalBayar = 0;
        for (double biaya : totalBiaya) {
            totalBayar += biaya;
        }
        return totalBayar * 1.1; // pajak 10%
    }
}

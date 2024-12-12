import java.util.Scanner;

public class Nomor1 {
    public static double hitungLuasSegitiga(int alas, int tinggi) {
        return (double) alas * tinggi / 2;
    }

   
    public static void tampilkanFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai N : ");
        int N = input.nextInt();

        // Tampilkan output FizzBuzz
        tampilkanFizzBuzz(N);

        // Tampilkan jumlah method dalam kelas
        System.out.println(Nomor1.class.getDeclaredMethods().length);
    }
}

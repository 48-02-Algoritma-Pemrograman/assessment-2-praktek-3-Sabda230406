import java.util.ArrayList;
import java.util.Scanner;

public class Nomor1 {
    static ArrayList<String> nPrint(int n) {
        ArrayList<String> outPut = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                outPut.add(String.valueOf(i));
            } else if (i % 3 == 0 && i % 5 == 0) {
                outPut.add("FizzBuzz");
            } else if (i % 3 == 0) {
                outPut.add("Fizz");
            } else if (i % 5 == 0) {
                outPut.add("Buzz");
            } else {
                outPut.add(String.valueOf(i));
            }
        }
        return outPut;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        ArrayList <String> outPut = nPrint(N);
        for (int i=0;i<=N;i++){
            if (i==N) {
                System.out.println(outPut.get(i));
            } else {
            System.out.print(outPut.get(i)+" ");
            }
        }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length);
    }

}

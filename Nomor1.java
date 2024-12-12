import java.util.Scanner;

public class feast {
    static String fizz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } 
        return String.valueOf(n);
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<=n;i++){
            System.out.println(fizz(i));
        }
        sc.close();
    }
}

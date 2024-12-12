import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
         Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<=n;i++){
            System.out.println(fizz(i));
        }
        sc.close();
    }
    public static String fizz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } 
        return String.valueOf(n);
        
    
    

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    }
    



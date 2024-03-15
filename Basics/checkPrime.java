// Program for printing prime numbers from 2 to N

import java.util.Scanner;

/**
 * checkPrime
 */
public class checkPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth Number--> ");
        int num = in.nextInt();

        for(int i = 1; i <= num; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        in.close();
    }

    static boolean isPrime(int n){
        if (n == 0 || n == 1){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// print armstrong numbers from 1 to N

import java.util.Scanner;

/**
 * narmStrong
 */
public class narmStrong {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int i = 1; i <= num; i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }

       in.close();
       
    }

    static boolean armstrong(int n){
        int remainder;
        int sumOfCube = 0;
        int temp = n;
        while(n > 0){
            remainder = n % 10;
            sumOfCube = sumOfCube + (remainder * remainder * remainder);
            n = n / 10;
        }

        if (temp == sumOfCube){
            return true;
        } else {
            return false;
        }
    }
}
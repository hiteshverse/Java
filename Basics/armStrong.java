// ArmStrong num = sum of cubes of any number 
// e.g. 153 = 1^3 + 5^3 + 3^3
//          = 1 + 125 + 27
//          = 153

import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        int num = in.nextInt();
        System.out.println(isArmstrong(num));
        in.close();
    }    

    static boolean isArmstrong(int n){
        int remainder = 0;
        int sumOfCube = 0;     
        int copy = n;

        while(n > 0){
            remainder = n % 10;
            sumOfCube = sumOfCube + (remainder * remainder * remainder);
            n = n / 10;
        }

        return copy == sumOfCube;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i = 0; i < testCase; i++){
            int friends = sc.nextInt();
            int cost = sc.nextInt();

            int totalCost = 0;
            if(friends >= 6){
                double temp = friends / 6;
                System.out.println(Math.ceil(temp));
            } else {
                totalCost = 1 * cost;
            }
            
            System.out.println(totalCost);
        }

        sc.close();
    }
}
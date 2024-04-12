import java.util.Scanner;

/**
 * Inheritance
 */
public class Inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();
        int[] arr = new int[test_case];

        for(int i = 0; i < test_case; i++){
            arr[i] = sc.nextInt();
            arr[i] *= -1;
        }

        for(int i = 0; i < test_case; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
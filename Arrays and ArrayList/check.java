import java.util.ArrayList;
import java.util.Scanner;

/**
 * check
 */
public class check {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int input;
        while((input = sc.nextInt()) > 0){
            list.add(input);
        }

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}
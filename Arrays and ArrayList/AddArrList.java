import java.util.*;

public class AddArrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int input;
        while((input = sc.nextInt()) > 0){
            list.add(input);
        }

        reverseList(list);
        sc.close();
    }
    
    static void reverseList(ArrayList<Integer> a){
        for(int i = a.size() - 1; i >= 0; i--){
            System.out.print(a.get(i) + " ");
        }
    }
}


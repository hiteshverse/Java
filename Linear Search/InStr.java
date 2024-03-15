import java.util.Arrays;

public class InStr {
    public static void main(String[] args) {
        String ch = "Linear";
        char target = 'n';

        System.out.println(linearSearch(ch, target));
        System.out.println(Arrays.toString(ch.toCharArray()));
    }

    static boolean linearSearch(String a, char b){
        if(a.length() == 0){
            return false;
        }

        for(char ch: a.toCharArray()){
            if(ch == b){
                return true;
            }
        }
        return false;
    }
}

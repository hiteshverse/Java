import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int arr[] = {3, 53, 23, 43, 34, 22, 64, 26};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr)); // 26, 64, 22, 34, 43, 23, 53, 3;
    }

    static void reverseArr(int[] a){
        for(int i = 0; i < a.length / 2; i++){
            int temp = a[i]; // temp = 3; temp = 53; temp = 23; temp = 43;
            a[i] = a[(a.length - 1) - i]; // a[0] = 26; a[1] = 64; a[2] = 22; a[3] = 34;
            a[(a.length - 1) - i] = temp; // a[7] = 3;  a[6] = 53; a[5] = 23; a[4] = 43;
        }
    }
}

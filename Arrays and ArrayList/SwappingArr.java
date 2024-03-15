import java.util.Arrays;

public class SwappingArr {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] x, int y, int z) {
        int temp = x[y];
        x[y] = x[z];
        x[z] = temp;
    }

}

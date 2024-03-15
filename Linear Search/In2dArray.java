// import java.util.Arrays;

public class In2dArray {
    public static void main(String[] args) {
        int[][] arr = {{34, 23, 64, 13, 65}, {54, 34, 24, 75, 12}};
        // int findNum = 54;
        // int[] ans = linearSearch(arr, findNum);
        // System.out.println(Arrays.toString(ans));
        System.out.println(linearSearch(arr));
    }

    static int linearSearch(int[][] x){
        if(x.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                if(x[i][j] > max){
                    max = x[i][j];
                }
            }
        }

        return max;
    }
}
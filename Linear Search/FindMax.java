public class FindMax {
    public static void main(String[] args) {
        int[] arr = {2, 64, 3, 65, 24, 5, 4};
        int res = findMax(arr);
        System.out.println(res);
    }

    static int findMax(int[] arr){

        if(arr.length == 0){
            return -1;
        }
        
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if(num > max){
                max = num;
            }
        }

        return max;
    }
}

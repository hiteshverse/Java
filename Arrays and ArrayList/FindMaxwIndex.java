public class FindMaxwIndex {
    public static void main(String[] args) {
        int[] arr = {3, 53, 23, 43, 34, 22, 64, 26};
        System.out.println("Max Element in Array : " + findMax(arr, 2, 5));
    }

    static int findMax(int[] a, int start, int end){
        int max = Integer.MIN_VALUE;
        if(a.length == 0){
            return -1;
        } else {
            for(int i = start; i <= end; i++){
                if(a[i] > max){
                    max = a[i];
                }
            }
            return max;
        }
    }
}

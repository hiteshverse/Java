public class FindMaxinArr {
    public static void main(String[] args) {
        int[] arr = {29, 45, 32, 53, 232, 24, 1, 0};
        System.out.println("Max Element in this Array : " + findMax(arr));
    }

    static int findMax(int[] x){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < x.length; i++){
            if(x[i] > max){
                max = x[i];
            }
        }
        return max;
    }
}

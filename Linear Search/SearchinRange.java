public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {2, 54, 76, 23, 65, 34, 87};
        int start = 2;
        int end = 5;
        int find = 76;

        System.out.println(linearSearch(arr, start, end, find));
    }

    static boolean linearSearch(int[]a, int b, int c, int d){
        if(a.length == 0){
            return false;
        }
        for(int i = b; i <= c; i++){
            if(a[i] == d){
                return true;
            }
        }
        return false;
    }
}

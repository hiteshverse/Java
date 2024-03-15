public class SeachinArr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 64, 34, 12, 64, 65};
        int find = 122;
        System.out.println(searchArr(arr, find));
    }

    static boolean searchArr(int[] a, int b){
        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                return true;
            }
        }
        return false;
    }
}

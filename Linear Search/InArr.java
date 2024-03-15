public class InArr {
    public static void main(String[] args) {
        int[] arr = {12, 53, 23, 20, 34, 134, 93, 383};
        int find = 20;
        System.out.print(linearSearch(arr, find));
    }    

    static boolean linearSearch(int[] a, int b){
        if(a.length == 0){
            return false;
        } 

        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                return true;
            }
        }
        return false;
    }
}
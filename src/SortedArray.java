public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println((sort(arr)));
    }
    static boolean sort(int[] arr){
        return helper(arr, 0);
    }
    private static boolean helper(int[]arr,int index){
        // base condition
        if(index==arr.length-1){
            return true;
        }
        return  arr[index]<arr[index+1]&&helper(arr,index+1);
    }

}
// arr in every function call will pointing to the same object.


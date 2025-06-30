import java.util.Arrays;

public class mergeSortUsingRecursion {
    public static void main(String[] args) {
//        divide the array into two halves
//        sort them via recursion and
//        then merge them
//        these subparts are different recursion calls.
//        when one of the array is empty put the elements of the other array
//        which is not empty behined the elements of the newly created array.
//        in this original array is not modified every time it creates
//        a new left and right and merge them in a new array.
//        of size left+right.
//        at every level n elements are being merged
//        O(nlogn).
//        t(n/2) + t(n/2) + (n-1)
//        2t(n/2)+(n-1)
//        space complexity = O(n).
//
//        int[] arr = {5,4,3,2,1};
//        arr = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
        int[]arr = {5,4,3,2,1};
          inplaceMergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[]arr){
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i< first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete.
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    static void inplaceMergeSort(int[]arr,int s,int e){
        if (e-s==1){
            return;
        }
        int mid = (s+e)/2;
        inplaceMergeSort(arr,s,mid);
        inplaceMergeSort(arr,mid,e);
         mergeInPlace(arr,s,mid,e);
    }
    private static void mergeInPlace(int[]arr,int s,int m,int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];

            
        }
       
    }
}

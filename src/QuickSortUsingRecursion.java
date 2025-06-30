import java.util.Arrays;

public class QuickSortUsingRecursion {
    public static void main(String[] args) {
        //....pivot....
//        choose any element --> after first pass all the elements
//        less than pivot will be on LHS of pivot
//        & elements greater than pivot will be at RHS of pivot.
//        if the array is already sorted it will not sort it anymore
//        means not go to the very last element as the case in mergesort
//
//        how to put pivot at correct position.

//        take start and end at the start and end of the array
//        the condition is the elements at lhs of pivot should be less then
//        the elements at rhs of pivot should be greater than pivot
//        so whenever we find a violation we just swap the elements of
//        start and end.

//        how to pick pivot

//        1) random element
//        2) corner elements
//        3) pick the middle element

//        t(n) = t(k)+t(n-k-1)+O(n) --- important

//        worst case
//        if you pick the pivot as the first or the last element of an
//        array the recursion step will be reduced a little like n-1
//        that is very bad ie when k=0 t(n) = t(0) + t(n-1) +O(n).
//        == O(n)**2.
//
//        best case
//        when k = n/2 that is the pivot is the middle  element
//        t(n) = 2T(n/2)+O(n).---O(nlogn).
//        not stable
//        in-place i.e why prefered for arrays instead of mergesort
//        mergesort takes O(n) extra space
//        mergesort is better in linked list due to memory allocation not
//        continous.
//
//
        int[] arr = {5,4,3,2,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums,int low, int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end  = high;
        int mid = start+(end - start)/2;
        int pivot = nums[mid];

        while(start<=end){
            // also a reason why if its already sorted it will not swap
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end --;
            }
            if(start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        // now my pivot is at correct index, please sort two halves.
        sort(nums,low,end);
        sort(nums,start,high);

    }
}

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        // variables : 1. Arguments
        //             2. Return Type
        //             3. Body of function
        // do not over think
        // arguments
        //--- whatever you put in the arguments is
        // going to go in the next function call
        // body of function
        // -- variables specific to that function call
        //  -- will be in the function body
        // whenever you are calling a recursion call
        // make sure you sre returning it if it has
        // a return type...
        int[] arr = {1,2,3,4,5,6,7,8};
        int result = search(arr,7,1,8);
        System.out.println(result);


    }
    static int search(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }else{
            return search(arr,target,m+1,e);
        }


    }
}



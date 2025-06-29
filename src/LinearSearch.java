import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr ={1,2,34,4,4,42,42,13,2};
        int target = 42;
        int result = Linear(arr,target,0);
        System.out.println(result);
        LinearAll(arr,4,0);
        System.out.println(list);
        ArrayList<Integer>ans = LinearAll1(arr,target,0,new ArrayList<>());
        System.out.println(ans);
        System.out.println(LinearAll2(arr,target,0));
    }
    static int Linear(int[] arr,int target,int index){
        if(index== arr.length){
            return -1;
        }
        if( arr[index]==target){
            return index;
        }else {
            return Linear(arr,target,index+1);
        }

    }
     static ArrayList<Integer>list = new ArrayList<>();
    static void LinearAll(int[] arr,int target,int index){
        if(index== arr.length){
            return;
        }
        if( arr[index]==target){
            list.add(index);
        }
        LinearAll(arr,target,index+1);


    }
    //returning an arraylist.
    static ArrayList <Integer> LinearAll1(int[] arr,int target,int index,ArrayList<Integer>list){
        if(index== arr.length){
            return list;
        }
        if( arr[index]==target){
            list.add(index);
        }
        return  LinearAll1(arr,target,index+1,list);
// if you don't need to create the arraylist outside the function
// you can add in the argument and then return the list.
// In every function call the list is a reference variable pointing
// to the same object.
   }
   // return the list but don't take it in the argument.
//    challenges -- return type will be arraylist.
//    --problem = every call will have a new list.
//    here is different object for different function call because
//    list is defined again and again in every fn call body hence
//    if you add something in the list that will be available for that
//    fn call only -- how to connect these answers?

//    whenever you are returning the answer from below fn calls while
//    doing that you can check something does the current fn call
//    have some answers return them with the call.
    static ArrayList <Integer> LinearAll2(int[] arr,int target,int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
        return list;
        }
        // this will contain ans for that fn call only
        if (arr[index] == target) {
        list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = LinearAll2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }


}

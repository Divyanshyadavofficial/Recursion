import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr ={1,2,34,4,4,42,42,13,2};
        int target = 42;
        int result = Linear(arr,target,0);
        System.out.println(result);
        LinearAll(arr,4,0);
        System.out.println(list);
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
    static ArrayList LinearAll1(int[] arr,int target,int index,ArrayList<Integer>list){
        if(index== arr.length){
            return list;
        }
        if( arr[index]==target){
            list.add(index);
        }
        return  LinearAll1(arr,target,index+1,list);


    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetProblems {
    public static void main(String[] args) {
        // str = "abc"
        // ans = ["a","b","c","ab","ac","bc","abc"]
        // order does not matter "ab", "ba" is same.
        // if an arr has n elements it will have 2**n subsets.

//          this pattern of taking some elements & removing some is
//          known as subset pattern...

            subseq("","abc");
            ArrayList<String> result =  subseq1("","abc");
            System.out.println(result);
            subseqAscii("","abc");
            ArrayList<String> result1 = subseqAscii1("","abc");
            System.out.println(result1);
            int[] arr = {1,2,3};
            List<List<Integer>> ans = subset(arr);
            for(List<Integer>list: ans){
                System.out.println(list);
            }
            System.out.println();
            int[] arr1 = {1, 2, 2};
            List<List<Integer>> result2 = subset1(arr1);
            for (List<Integer> list : result2) {
            System.out.println(list);
        }
    }

    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseq1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq1(p+ch,up.substring(1));
        ArrayList<String> right = subseq1(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
    }

    static ArrayList<String> subseqAscii1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAscii1(p+ch,up.substring(1));
        ArrayList<String> second = subseqAscii1(p,up.substring(1));
        ArrayList<String> third = subseqAscii1(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

    // iterative program

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }


    static List<List<Integer>> subset1(int[] arr) {
            Arrays.sort(arr); // Sort to handle duplicates
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());

            int start = 0;
            int end = 0;

            for (int i = 0; i < arr.length; i++) {
                start = 0;

                // If current element is same as previous, start from end+1
                if (i > 0 && arr[i] == arr[i - 1]) {
                    start = end + 1;
                }

                end = outer.size() - 1;
                int n = outer.size();

                for (int j = start; j < n; j++) {
                    List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);  // Use arr[i], not arr[j]
                    outer.add(internal);
                }
            }

            return outer;
    }
}



// when you find a duplicate element,only add it in the newly created
// subset of previous step.
// because of above point duplicates have to be together.
// i.e sort the array.


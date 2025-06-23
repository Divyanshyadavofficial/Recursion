public class passingNumbers {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--);
        fun(--n);
//        n-- or --n
//     n--   this will pass the value of
//     n first and then subtract the number.
//    --n subtract first then pass.
    }
}

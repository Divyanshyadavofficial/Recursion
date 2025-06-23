public class CountZeros {
    public static void main(String[] args) {
        int Count = Countzeros(3020);
        System.out.println(Count);
        // important concept
    }
    static int Countzeros(int n){
       return helper(n,0);

    }
    // special pattern, how to pass a value to above calls.
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int digit = n%10;
        if(digit==0){
            return   helper(n/10,c+1);
        }
        return helper(n/10,c);

    }
}

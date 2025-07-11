public class ReverseOfaNumber {
    public static void main(String[] args) {
        Reverse(1234);
        System.out.println(sum);
        System.out.println(Reverse2(1234));
    }
    static int sum = 0;

    
    static void Reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        Reverse(n/10);
    }
    static int Reverse2(int n){
        // sometimes you might need some
        // extra variables in the argument
        // in that case, make another fn.
       int digits = (int)(Math.log10(n))+1;
       return helper(n,digits);

    }
    private static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem *(int) Math.pow(10,digits-1)+ (helper(n/10,digits-1));
    }
}

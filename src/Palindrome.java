public class Palindrome {
    public static void main(String[] args) {
        boolean palindrome = palindrome(1331);
        System.out.println(palindrome);
    }
    static boolean palindrome(int n){
        return n==Reverse(n);
    }
    static int Reverse(int n){
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

public class SumOfDigits {
    public static void main(String[] args) {
        int result = sumOfdigits(1342);
        System.out.println(result);

        
    }
    static int sumOfdigits(int n){
        if(n==0){
            return 0;
        }
         int  digit = n%10;
         n=n/10;
         return (digit + sumOfdigits(n));
    }
}

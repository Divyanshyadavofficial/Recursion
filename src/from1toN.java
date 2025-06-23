public class from1toN {
    public static void main(String[] args) {
        oneToN(5);
    }
    static void oneToN(int n){
        if(n==1){
            System.out.println(n);
        }else{
            oneToN(n-1);
            System.out.println(n);
        }
    }
}

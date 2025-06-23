public class fromNto1 {
    public static void main(String[] args) {
        nto1(5);
    }
    static void nto1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
         nto1(n-1);


    }
}

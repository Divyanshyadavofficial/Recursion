public class ProductOfNto1 {
    public static void main(String[] args) {
       int result =   product(5);
        System.out.println(result);
    }
    static int  product(int n){
        if(n==0){
            return 1;

        }
        return n*product(n-1);



    }


}



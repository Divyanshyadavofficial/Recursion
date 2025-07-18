public class CountSteps {
    public static void main(String[] args) {
        int result = numberOfSteps(222);
        System.out.println(result);
    }
    static int numberOfSteps(int num){
        return helper(num,0);
    }
    private static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}

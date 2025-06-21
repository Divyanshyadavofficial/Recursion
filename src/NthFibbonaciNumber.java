public class NthFibbonaciNumber {
    public static void main(String[] args) {
    // when you can break the bigger problem
    // into a smaller one then  you can apply recursion
    // to solve the problem.
        int n =7;
        int result = fibo(n);
        System.out.println(result);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return  fibo(n-1)+fibo(n-2);// when you write recursion
                                            // in a formula that's recurrence
                                            //   relation
    }
     // how to understand and approach a problem
    // 1. identify if you can break down problem into smaller problems
    // 2. write the recurrence relation if needed
    // 3. draw the recursive tree
    // 4. about the tree
    //    -- see the flow of functions, how they are getting in stack
    //    -- identify and focus on left tree calls and right tree calls
    //    -- draw the tree and pointer again and again using pen and paper
    //    -- use a debugger to see the flow
    // 5. see how the values and what values are returned at each step
    //    see where the functipn call will come out, In the end
    //    you will come out of the main function


}

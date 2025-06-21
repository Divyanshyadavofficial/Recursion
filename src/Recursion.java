public class Recursion {
    public static void main(String[] args) {
       //problem.....
        // if all these functions have the same
        // body and doing the same things then
        // why are you creating these functions
        // again and again

        //solution
        // a simple solution for this is call
        // the function itself.
        // here the parameter is n and it is calling
        // n+1.
        print(1);
        // a function that calls itself.. Recursion
        // base condition
        // a condition where our recursion will stop making new calls.
        // it is a simple if condition.

        // no base condition means func calls will keep happening
        // stack will be filled again and again
        // every call takes memory and one time will come when memory
        // will exceed the limit ---> stack overflow error.


    }
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }// this is the base condition
        System.out.println(n);
        //  this is called tail recursion i.e it is the last func call
        print(n+1);
    }
    // recursive call
    // if you are calling a fn again and again you can treat it as
    // a seprate call in the stack..

    // why recursion...

    /*
    1. it helps us in solving bigger/ complex problems in a simple way. by
       breaking them in small problems
    2. you can convert recursion solutions into iterations & vice versa.
    3. space complexity is not constant because of the recursion calls

    visualizing Recursion  --> recursion tree..
    */


}

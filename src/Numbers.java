public class Numbers {
    public static void main(String[] args) {
        // write a func that takes a number and prints it
        // print first 5 numbers: 1,2,3,4,5
        // same as the message example
        // 1.function is calling another func
        // 2.all these function has one thing in common the body and the
        // definition is same
        // 3.

        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }static void print5(int n){
        System.out.println(n);
    }
    // how the function calls work internally
    /*
    1. while the func is not finished executing it will remain in stack
       main  function is the function that will go in the stack first and
       the last one to come out of the stack. means that the function is call
       is currently going on.

    2. when a function finishes executing it is removed from the stack and
       the flow of program is restored to where the function was called.



     */
}

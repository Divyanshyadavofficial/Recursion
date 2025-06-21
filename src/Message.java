//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Message {
    public static void main(String[] args) {
         // write a message to print hello world
        message();
        // without modifying this function if you have to print hello
        // world five times only one function you have to call
        // what i will do is create other functions and call them in the
        // message function
        // and the next function is called in the body of the previous func.
        // a function is calling another function.--> recursion....
        // when a function is finished executing it will comeout from where
        // it was called....

    }
    static void message(){
        System.out.println("hello world");
        message1();
    }
    static void message1(){
        System.out.println("hello world");
        message2();
    }
    static void message2(){
        System.out.println("hello world");
        message3();
    }
    static void message3(){
        System.out.println("hello world");
        message4();
    }
    static void message4(){
        System.out.println("hello world");

    }
}
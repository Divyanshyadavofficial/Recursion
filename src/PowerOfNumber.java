//A recursive function to calculate a^b (i.e., "a raised to the power b").

public class PowerOfNumber {

    public static int power(int a, int b) {
        // Base case: anything to the power of 0 is 1
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(a + "^" + b + " = " + power(a, b));  // Output: 2^5 = 32
    }
}

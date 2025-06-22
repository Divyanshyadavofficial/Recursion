//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    suppose we have a old computer and a mac m1 they both process
//    the same data the old computer gives results in 10 seconds
//    the mac gives results in 1 sec
//
//    which one will have better time complexity ---
//
//    they both have the same time complexity then conclusion is
//
//    time complexity! = time taken.
//    it is a function that tells us how time grows as the input
//    grows.


//    why................

//    consider two algos having complexities big(O)N and log(N) and fix the
//    input size for both algorithms. there is a significant
//    time difference for same large input the algo having
//    big(oh)N complexity will take more time and log(n) will
//    take less time log(n) time complexity is an efficient sol
//    that's why we care

//    (O)1<O(logN)<O(n)<O(2**N)

//    what do we consider when thinking about complexity
    /*
    1. always look for worst case complexity
    2. always look at complexity for large data
    3. --- even though the value of actual time is diff they
            they are all growing linearly.
       --- we don't care about actual time
       --- this is why we ignore all constants.
    4. O(N**3+ log(n))
       from point 2
       ---> ((1 million)**3+log(1million))
       ---> (1million**3 + 6secs)
       ---> 6sec is the very small value hence ignore it
       Always ignore the less dominating terms that's the point.
    */

    // big-oh notation
    // upper bound
    // f(x) = O(g(x))
    // f(x)/g(x) < infinity for lim n---> infinity.

    // big omega notation
    // opposite of big oh
    // lower Bound
//     f(x)/g(x)>0.
//
//    what if an algo has lb and up as (n)**2
//    theta notation --> both upper bound and lower bound is N**2.
//    0 < lim n--->infinity f(x)/g(x) < infinity.
//
//    little oh notation
//    -- this is also giving ub but stronger  upperbound
//    -- f = O(g)
//    -- f < g strictly slower than g.
//    little omega notation
//    f = w(g)
//    f>g. strictly greater than g.
//    space complexity --> it is total space taken by the algo
//    with respect to the input size it includes both auxiliary space
//    and space used by input.


//    complexity of recursive programs.
//    1. if you take any level of the recursion tree is there
//        going to be a possibility for more than one function
//        call to be in the stack at same time?

//        at any given point of time no two function call at
//        the same level of recursion will be in the stack at
//        the same time.
//        only calls which are interlinked will be in the
//        stack at the same time.

//     2. height of recursion tree == space complexity
//
//

//    2 types of recursions...
//     1. linear
//     2. Divide and Conquer

//    divide and conquer
//    T(x) = a1T(b1x+func(x))+a2T(b2x+func(x))+
//    ---+akT(bkx+func(x)) + g(x) for x>=xo
//    T(n) = T(n/2) + c
//    a =1,b = 1/2, func = 0, g(x) = 0.
//     this g(n) is basically means
//    2T(N/2)+(n-1)
//    when you get ans from this + what you are doing taken
//    how much time.

//     how to actually solve to get complexity.
//    1. plug and chug
//    f(n) = f(n/2)+c
//    put this formula in the same equation for f(n).
//    2. masters theorem
//    3. Akra bazzi formula (best way)
//        --- T(x) = theta(x**p+x**p * integral(g(u)/u**p+1 *du)1 to x
//        -- this g(u) is a time complexity itself so less dominating
//        --- terms will be ignored hence this is a simple func
//        --- which can be easily integrated.
//    what is p?
//      it is basically sum of all i till k (ai*bi**p) = 1.
//    if you are unable to find p
//    when p < power of (g(x)) then ans  = g(x).

// solving linear recurrences
//    f(n) = f(n-1) + f(n-2)
//    fn = alpha^n.
//    form
//    f(x) = a1f(x-1) + a2f(x-2)+a3f(x-3)+---+anf(x-n)
//    f(x) = sum of(ai f(x-i), 1 till n. for ai , n is fixed
//    n = order of recurrence.
//    2. f(n) = c1(root1)^n + c2(root2)^n.
//    3. no. of roots = no. of answers you have already.
//    f(n) = O(1.6180)^n. time complexity for nth fibbonaci num.
//    for equal roots
//    if alpha is repeated r times then alpha^n, n*alpha^n,---,n^r-1*alpha(n)
//    are all solutions to the recurrence.
//    hence i can take 2 roots as 1 itself, nalpha^n.
//    it is homogeneous recurrence relation
//    cuz you dont have g(x) here.
//
//    non homogeneous recurrences
//     they have the extra fn g(x)
//    how to solve
//    1). replace g(n) by 0 and solve usually
//    2). take g(n) on one side and find particular solutions
//        guess something that is similar to g(n).
//    3). if g(n) = n^2, guess a polynomial of degree 2.
//    4). add both solutions together.
//    how to guess the particular soln
//    --->  if g(n) is exponential, guess of same type
//    ---> if it is polynomial guess of same degree
//    --->lets say you guessed f(n) = a*2^n and if fails
//    ---> then try (an+b)2^n, if this also fails increase
//    ---> the degree (a^2n+bn+c)2^n.

public static void main(String[] args) {
    int ans = fib(4);
    System.out.println(ans);
}
static int fib(int n){
    return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
}
}



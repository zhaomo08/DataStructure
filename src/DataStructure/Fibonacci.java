package DataStructure;

import utils.TimeTool;

public class Fibonacci {
    /** 0 1 2 3 4 5 6 7     从2 开始  如果是2  加一次 0+1   如果是 3  加两次 0+1=1 1+1 =2  如果是 加三次   4 0+1=1 1+1=2  1+2 =3
     *  0 1 1 2 3 5 8 13......
     */

    // 第一种递归
    public static int fib(int n){
        if (n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static int fib2(int n){
        if (n<=1){
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < n-1 ; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }


    public static void main(String[] args) {

        TimeTool.check("fib1", () -> {
            System.out.println(fib(50));
        });
        TimeTool.check("fib1", () -> {
            System.out.println(fib2(50));
        });

    }
}

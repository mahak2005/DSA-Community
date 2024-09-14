import java.util.Scanner;

public class fibonacci {
    public static boolean Fibonacci(int n) {
        if (n <= 1) {
            return true;
        }
        int a = 0;
        int b = 1;
        int c = a + b;
        if (n == a || n == b) return true;

        while (c <= n) {
            if (c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
        public static int fibo(int n){
            if(n==0 || n==1){
                return n;
            }
            return fibo(n-1)+fibo(n-2);
        }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//
//        System.out.println(Fibonacci(n));
//        long start=System.currentTimeMillis();

//        long end=System.currentTimeMillis();
//        System.out.println(end-start);
        System.out.println(fibo(n));
    }
}

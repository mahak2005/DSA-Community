import java.util.Scanner;
public class factorial {
    public static int FactorialNo(int n){
        if(n<=1){
            return 1;
        }
        int ans=1;
        for(int i=2;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
    public static int factorialRec(int n){
        if(n<=1){
            return 1;
        }
        return n*factorialRec(n-1);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n1=sc.nextInt();
        System.out.println("Factorial of the Number: "+FactorialNo(n1));
        System.out.println("Enter the Number:");
        int n2= sc.nextInt();
        System.out.println("Factorial of the Number(Recursive Way): "+factorialRec(n2));
    }
}


import java.util.Scanner;
public class MultiplicationTable {
    public static void table(int n, int max){
        for (int i=1;i<=max;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n1=sc.nextInt();
        System.out.println("Enter the Number till you want to print table:");
        int max= sc.nextInt();
        table(n1,max);
    }
}

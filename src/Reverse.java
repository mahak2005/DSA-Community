import java.util.Scanner;

public class Reverse {
    public static void reverseNo(int n){
        if(n==0){
            return;
        }
        while(n>0){
            System.out.println(n%10);
            n=n/10;
        }
    }
    public static int reverseNoUpdated(int n){
        if(n==0){
            return 0;
        }
        int reversedNo=0;
        while(n>0){
            int lastDigit=n%10;
            reversedNo=reversedNo*10+lastDigit;
            n=n/10;
        }
        return reversedNo;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number(way1):");
        int n1=sc.nextInt();
        reverseNo(n1);
        System.out.println("Enter the Number(way2):");
        int n2=sc.nextInt();
        System.out.println(reverseNoUpdated(n2));
    }
}

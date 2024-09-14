import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest element in the array is: "+largerNo(arr,n));
        System.out.println("Second Largest element in the array is: "+secondLargest(arr,n));

    }
    public static int largerNo(int[] arr,int n){
        int largest=arr[0];
        for(int i=0;i<n;i++){
            largest=Math.max(arr[i],largest);
        }
        return largest;
    }
    public static int secondLargest(int[] arr, int n){
        int secondLargest=Integer.MIN_VALUE;
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
        }
        return secondLargest;
    }
}
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target=sc.nextInt();
        System.out.println("Linear Search, element target found at indec: "+linearSearch(arr,target,n));
        System.out.println("Binary Search, element target found at indec: "+binarySearch(arr,target,n));
    }
    public static int linearSearch(int[] arr, int target, int n) {
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target, int n){
        int low=0;
        int high=n-1;
        int mid;
        while (low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target) {
                return mid;
            } else if (arr[mid]<mid) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return -1;
    }
}

import java.util.*;

public class Array2 {

    public static void main(String[] args) {
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(
            "The second largest element is: " + arr[arr.length - 2]
        );
    }
}

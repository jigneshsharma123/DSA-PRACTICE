package array_Problem;
import java.util.*;
@SuppressWarnings("unused")
public class Arrays {
 
	//method for printing the array 
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
			System.out.print("\n");
		}
		System.out.println("end of the list item.");
		
	}
	
	//method for taking the input with the use in the form of array and return array to the user
	public static int[] TakeInput() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the size of the Array : ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int j = 0; j < n; j++) {
				System.out.println("Enter the "+ j + "th element of the array:");
				arr[j] = sc.nextInt();
			}
			
			return arr;
		}
	}
	//method for returning the sum of the array element;
	public static int sumOfArray(int[] inputArray) {
		int n  = inputArray.length;
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += inputArray[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
//		int arr[] = TakeInput();
//		printArray(arr);
		
		int arr[] = {2,1,4};
		int ArraySum = sumOfArray(arr);
		System.out.printf("sum of the Array element is : %d",ArraySum);
	}
	
	
	
}

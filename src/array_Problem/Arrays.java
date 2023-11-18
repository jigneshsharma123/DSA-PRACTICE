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
	//method for performing linear search on the give array; 
	public static int LinearSearch(int[] arr, int item) {
		int n = arr.length;
		int idx = -1;
		int element  = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == item) {
			 idx = i;
			 element = arr[i];
			 break;
			} //end of the if
		} //end of the for loop
		if(idx != -1) {
			return idx;
		}
		else {
			return idx;
		}
	}
	
	
	// Arrange the numbers in array 1,3,5....6,4,3;
	//coding ninjas lecture 9 : Arrays
	public static int[] populate(int[] arr, int n) {
		
		int startidx = 0;
		int endidx =  n - 1;
		int startValue = 1;
		int endValue = 0;
		int mid = (int) ((double) n / 2);
         while(startidx != endidx) {
        	 if(startidx==0) {
        		 arr[startidx] = startValue;
        	    startidx++;
        	 }else {
        		 arr[startidx] = startValue+=2;
        	     startidx++;
        	 }
        	 if(endidx > mid) {
        		 arr[endidx] = endValue+=2;
        		 endidx--;
        	 }
        	 arr[mid] = n;
        	 
         } //end of the while;
		
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		int arr[] = TakeInput();
//		printArray(arr);
		
//		int arr[] = {2,1,4};
//		int ArraySum = sumOfArray(arr);
//		System.out.printf("sum of the Array element is : %d",ArraySum);
//		int arr[] = {2,1,4};
//		int output = LinearSearch(arr,4);
//		System.out.print(output);

		int n = 9;
	    int[] arr = new int[n];
	     int[] outputArr =  populate(arr,n);
	  printArray(outputArr);
	}
	
	
	
}

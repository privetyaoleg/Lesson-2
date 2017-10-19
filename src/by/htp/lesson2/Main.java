package by.htp.lesson2;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int size;
		
		do {
		System.out.print("Enter the size of your array = ");
		size = sc.nextInt();
		}
		while (size <= 0);
		
		int[] array = new int[size];
		
		for (int i = 0; i<array.length; i++) {
			System.out.print("Enter " + (i+1) + " element = ");
			array[i] = sc.nextInt();
		}
		printArray(array);
		
		int operation;
		do {
		System.out.println("\n\tSelect an operation: ");
		System.out.println("1 - Find MAX value.\n2 - Find MIN value.\n3 - Sort ABS.\n4 - Sort DSC.\n5 - Quit");
		operation = sc.nextInt();
		
		switch (operation) {
		case 1:
			printArray(array);
			System.out.println("Max value = " + findMaxValue(array));
			break;
		case 2:
			printArray(array);
			System.out.println("Min value = " + findMinValue(array));
			break;
		case 3:
			printArray(array);
			sortArray(array, "abs");
			break;
		case 4:
			printArray(array);
			sortArray(array, "dsc");
			break;
		case 5:
			System.out.println("Good bye :)");
			break;
		default:
			System.out.println("ERROR! UNKNOWN OPERATION! TRY AGAIN!");
			break;
		}
		}
		while (operation != 5);
		
	
	}

	
	static public int findMaxValue(int[] array){
		int max = array[0];
		for (int i = 0; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
			
		return max;
	}
	
	static public int findMinValue(int[] array){
		int min = array[0];
		for (int i = 0; i < array.length; i++)
			if (array[i] < min)
				min = array[i];
			
		return min;
	}
	
	static public void sortArray(int[] numbers, String mode) {
		
		if (mode.equals("abs")){
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length-1; j++) {
				if (numbers[j] > numbers[j+1]){
						int temp = numbers[j];
						numbers[j] = numbers[j+1];
						numbers[j+1] = temp;
					}
				}
			
			}
		} 
		if (mode.equals("dsc"))
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers.length-1; j++) {
					if (numbers[j] < numbers[j+1]){
							int temp = numbers[j];
							numbers[j] = numbers[j+1];
							numbers[j+1] = temp;
					}
				}
				
			}
		System.out.println("Sorted array: " + Arrays.toString(numbers));
		}
	
	static public void printArray (int[] array) {
		System.out.println("Your array: " + Arrays.toString(array));
	}
	
	
}
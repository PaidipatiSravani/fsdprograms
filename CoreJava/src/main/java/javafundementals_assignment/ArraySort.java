package javafundementals_assignment;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter numbers");
		int[] array={1,9,13,2,5};
		int[] temp=new int[array.length];
		for(int i=0;i<5;i++){
			temp[i]=array[i];
		}
		System.out.println("before sorting in copy array");
		for(int j=0;j<temp.length;j++){
			System.out.print(temp[j]+" ");
		}
		int max=temp[0];
		
		for(int i=0;i<temp.length;i++){
			if(max<temp[i]){
				max=temp[i];
			}
		}
		System.out.println("after sorting in copy array");
		for(int j=0;j<temp.length;j++){
			System.out.print(temp[j]+" ");
		}

	}

}

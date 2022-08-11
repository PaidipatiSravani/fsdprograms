package collections_assignment;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		
		int[] arr={1,2,3,4,5,6};
		int temp[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				
			}
			else{
				temp[i]=arr[i];
			}
			
		}for(int j=0;j<temp.length;j++){
			System.out.println(temp[j]);
		}
	}

}

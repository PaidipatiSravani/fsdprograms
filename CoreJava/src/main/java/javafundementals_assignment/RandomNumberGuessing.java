package javafundementals_assignment;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessing {

	public static void main(String[] args) {
		boolean type=true;
		while(true){
		System.out.println("welcome to random number guessing game!!");
		Random r=new Random();
		System.out.println("numbers will be generated between 0-9");
		int number=r.nextInt(10);
		//System.out.println("random num:"+number);
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter your move player -1");
		int fNum=s.nextInt();
		
		System.out.println("enter your move player-2");
		int sNum=s.nextInt();
		
		System.out.println("enter your move player-3");
		int tNum=s.nextInt();
		
		if(fNum==number){
			System.out.println("player-1 is the winner");
			type=false;
		}if(sNum==number){
			System.out.println("player-2 is the winner");
			type=false;
		}if(tNum==number){
			System.out.println("player-3 is the winner");
			type=false;
		}
		if(fNum!=number||sNum!=number||tNum!=number){
			System.out.println("better luck next time");
			type=true;
		}
	}
	}
}

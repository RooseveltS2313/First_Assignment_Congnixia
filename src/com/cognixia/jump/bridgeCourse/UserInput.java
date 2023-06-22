package com.cognixia.jump.bridgeCourse;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type something for the console.");
		String storage = input.nextLine();
				
		System.out.println("You have typed : "  + storage);
		
		input.close();
		// input types can be specified by Primitive type
	}

}

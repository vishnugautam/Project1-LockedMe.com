package feature3;

import java.util.Scanner;

import mainMenu.Repeats;

public class ExitProgram implements Repeats{
	
	@Override
	public void display() {
		System.out.println("\n");
		System.out.println("Enter 1 to start the program \n");
		System.out.println("Enter 2 to exit the program \n");
		System.out.println("\n");
	}
	
	@Override
	public String location() {
		System.out.println("Please Enter the directory path to which the program must function:  \n");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		return path;
	}
	
	public boolean stopProgram() {
		display();
		boolean finalChoice = true;
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if(option == 1) {
			return finalChoice;
		} else if(option == 2){
			return finalChoice = false;
		} else {
			System.out.println("Enter between 1 or 2 \n");
		}
		System.out.println(finalChoice);
		return finalChoice;
	}
}

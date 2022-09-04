package feature2;
import java.io.File;
import java.util.Scanner;

import mainMenu.MainMenu;
import mainMenu.Repeats;

public class DeleteFile implements Repeats {
	
	@Override
	public void display() {
		System.out.println("\n");
		System.out.println("Enter 1 to enter the name of the file to Delete: \n");
		System.out.println("Enter 2 to return to filing options \n");
		System.out.println("Enter 3 to return to main menu");
		System.out.println("\n");
	}
	
	@Override
	public String location() {
		System.out.println("Please Enter the directory path to which the program must function:  \n");
		System.out.println("Copy the actual path from the command line ex - \"C:\\\\Users\\\\Vishnu\\\\Desktop\\\\Post graduation in full stack web development\\\\Project1-LockedMe.com\" "
				+ "and paste it here: ");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		return path;
	}
	
	public void deleteFile() {
		String usrPath = location();
		display();
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		
		if(userChoice == 1) {
		
			Scanner sc1 = new Scanner(System.in);
			String fileName = sc1.next();
			File deleteName = new File(usrPath + fileName); // this doesn't create a file but an instance of it 
			
			boolean value = deleteName.delete();
			
			
			if(value) {
				System.out.println("The file has been deleted");
				System.out.println("\n");
				deleteFile();
				
			} else {
				System.out.println("The file cannot be found");
				System.out.println("\n");
				deleteFile();
			}
			} else if(userChoice == 2) {
				FileHandling fh = new FileHandling();
				fh.fileHandling();
			} else if (userChoice == 3) {
				MainMenu mm = new MainMenu();
				mm.choices();
			} else {
				System.out.println("Please enter between 1, 2 or 3");
			}
		
	}
}

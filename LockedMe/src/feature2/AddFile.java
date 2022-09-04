package feature2;
import java.io.File;
import java.util.*;

import mainMenu.MainMenu;
import mainMenu.Repeats;


public class AddFile implements Repeats{
	
	@Override
	public void display() {
		System.out.println("\n");
		System.out.println("Enter 1 to enter file name to add: \n");
		System.out.println("Enter 2 to move to file options \n");
		System.out.println("Enter 3 to move to main menu");
		System.out.println("\n");
	}
	
	@Override
	public String location() {
		System.out.println("Please Enter the directory path to which the program must function:  \n");
		System.out.println("Copy the actual path from the command line ex - 'C:\\\\Users\\\\Vishnu\\\\Desktop\\\\' and paste it here:  \n");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		return path;
	}
	
	public void addFile() {
		
		String usrPath = location();
		
		display();
		Scanner sc1 = new Scanner(System.in);
		int userChoice = sc1.nextInt();
		
		if(userChoice == 1) {
			System.out.println("Enter file name to be added: \n");
			Scanner sc = new Scanner(System.in);
			String fileName = sc.next();
			File newFile = new File(usrPath + fileName);
			
			try {
				boolean fileCreated = newFile.createNewFile();
				if(fileCreated) {
					System.out.println("New file is created: " + newFile);
				} else {
					System.out.println("File already exists!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n");
			System.out.println("Enter 1 to move to file options \n");
			System.out.println("Enter 2 to move to main menu \n");
			
			Scanner sc2 = new Scanner(System.in);
			int option = sc2.nextInt();
			if (option == 1) {
				FileHandling fh = new FileHandling();
				fh.fileHandling();
			} else if (option == 2) {
				MainMenu mm = new MainMenu();
				mm.choices();
			} else {
				System.out.println("Please enter a number between 1 or 2 \n");
			}
			
		} else if(userChoice == 2) {
			FileHandling fh = new FileHandling();
			fh.fileHandling();
		} else if(userChoice == 3) {
			MainMenu mm = new MainMenu();
			mm.choices();
		} else {
			System.out.println("Please enter between 1, 2 or 3");
		}
		
	}

}

package feature2;
import java.io.File;
import java.util.Scanner;

import mainMenu.MainMenu;
import mainMenu.Repeats;

public class SearchFile implements Repeats{
	
	@Override
	public void display() {
		System.out.println("\n");
		System.out.println("Welcome to search file feature! \n");
		System.out.println("Please enter 1 to enter the name of the file to be searched: \n");
		System.out.println("Enter 2 to move to the file handling menu \n");
		System.out.println("Enter 3 to move to the main menu");
		System.out.println("\n");
	}
	
	@Override
	public String location() {
		System.out.println("Please Enter the directory path to which the program must function:  \n");
		System.out.println("Copy the actual path from the command line ex - \'C:\\\\Users\\\\Vishnu\\\\Desktop\\\\'"
				+ "and paste it here: ");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		return path;
	}
	
	public void searchFile() {
		
		String usrPath = location();
		
		display();
		
		Scanner sc1 = new Scanner(System.in);
		int userChoice = sc1.nextInt();
		
		if(userChoice == 1) {
		
			SearchFile sf = new SearchFile();
			sf.display();
			Scanner sc = new Scanner(System.in);
			String fileName = sc.next();
			File path = new File(usrPath);
			String[] contents = path.list();
			
			for(int i = 0; i < contents.length; i++) {
				if(contents[i] == fileName) {
					System.out.println("The file is in the directory");
				} else {
					System.out.println("The file is not in the directory");
				}
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

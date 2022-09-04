package feature1;
import java.util.*;

import feature2.FileHandling;
import mainMenu.MainMenu;
import mainMenu.Repeats;

import java.io.File;

public class RetrieveDataAscending implements Repeats {
	
	@Override
	public void display() {
		System.out.println("\n");
		System.out.println("Enter 1 to retrieve the files \n");
		System.out.println("Enter 2 for file handling menu \n");
		System.out.println("Enter 3 for main menu");
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
	
	public void retrieveData() {
		String usrPath = location();
//		System.out.println(usrPath);
		display();
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		if(userChoice == 1) {
			MainMenu mm = new MainMenu();

			File path = new File(usrPath);
			ArrayList<String> list = new ArrayList<String>();
			String[] contents = path.list();
			
			for(int i = 0; i < contents.length; i++) {
				list.add(contents[i]);
			}
			System.out.println("The retrieved files are as below: \n");
			Collections.sort(list);
			System.out.println("Sorted list in ascending order: \n" + list);
			System.out.println("\n");
			System.out.println("Please enter 1 for file handling menu \n");
			System.out.println("Please enter 2 for main menu");
			Scanner sc1 = new Scanner(System.in);
			int userChoice1 = sc1.nextInt();
			if (userChoice1 == 1) {
				FileHandling fh = new FileHandling();
				fh.fileHandling();
			} else if(userChoice1 == 2) {
				mm.choices();
			} else {
				System.out.println("Please enter a number between 1 or 2");
			}
			
		} else if(userChoice == 2) {
			FileHandling fh = new FileHandling();
			fh.fileHandling();
		} else if(userChoice == 3) {
			MainMenu mm = new MainMenu();
			mm.choices();
		} else {
			System.out.println("Please enter 1 or 2");
		}
	}



}

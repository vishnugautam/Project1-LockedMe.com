package feature2;
import java.util.*;

import mainMenu.MainMenu;
import mainMenu.Repeats;

public class FileHandling implements Repeats{
	@Override
	public void display() {
		System.out.println("\n");
		System.out.println("Select between these 3 options:");
		System.out.println("\n");
		System.out.println("Type 1 to Add a file \n");
		System.out.println("Type 2 to Delete a file \n");
		System.out.println("Type 3 to Search a file \n");
		System.out.println("Type 4 for main menu");
		System.out.println("\n");
	}
	
	@Override
	public String location() {
		System.out.println("Please Enter the directory path to which the program must function:  \n");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		return path;
	}
	
	public void fileHandling() {
		display();
		Scanner sc = new Scanner(System.in);
		int userOpt = sc.nextInt();
		
		if(userOpt == 1) {
			AddFile addFile1 = new AddFile();
			addFile1.addFile();
		} else if (userOpt == 2) {
			DeleteFile deleteFile1 = new DeleteFile();
			deleteFile1.deleteFile();
		} else if (userOpt == 3) {
			SearchFile searchFile = new SearchFile();
			searchFile.searchFile();
		} else if(userOpt == 4){
			MainMenu mm = new MainMenu();
			mm.choices();
		}
	}
	
}

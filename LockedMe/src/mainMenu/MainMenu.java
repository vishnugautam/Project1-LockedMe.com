package mainMenu;
import java.util.*;
import mainMenu.Repeats;
import feature1.RetrieveDataAscending;
import feature2.FileHandling;
import feature3.ExitProgram;
public class MainMenu implements Repeats{
		
		@Override
		public void display() {
		System.out.println("\n");
		System.out.println("Hello welcome to LockedMe.com");
		System.out.println("The creator name is Vishnu Gautam");
		System.out.println("\n");
		
	}
	@Override
	public String location() {
		System.out.println("Please Enter the directory path to which the program must function:  \n");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		return path;
	}
		
	public void choices() {
		ExitProgram ep = new ExitProgram();
		boolean userExit = ep.stopProgram();
//		System.out.println(userExit);
		while(userExit) {
			display();
			System.out.println("Choose: ");
			System.out.println("1. Retrieving all the files");
			System.out.println("2. File options");
			System.out.println("3. Exit program");
			
			Scanner sc = new Scanner(System.in);
			
			int userChoice = sc.nextInt();
			if(userChoice == 1) {
				RetrieveDataAscending rda = new RetrieveDataAscending();
				rda.retrieveData();
	
			} else if(userChoice == 2) {
				FileHandling fh = new FileHandling();
				fh.fileHandling();
				
			} else if(userChoice == 3) {
				ep.stopProgram();
				
			}
			break;
		}
		
	}
	
	public static void main(String[] args) {
			MainMenu mm = new MainMenu();
			mm.choices();
		
	}
	
}

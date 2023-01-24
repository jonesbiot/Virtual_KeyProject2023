package client;
import java.io.*;
import java.util.*;
import operations.BusinessLevelOperarions;

public class KeyApp {

	public static void main(String[] args) {
		welcomeScreen();
		try {
			menuDriven();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public static void welcomeScreen() {
		System.out.println("Application Name : LOCKEDME.COM \n");
		System.out.println("Developer Details: Jones Biot Banabale \n");
	}

	public static void menuDriven() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		BusinessLevelOperarions obj = new BusinessLevelOperarions();
		int option;
		do {
		System.out.println("Enter your Option:\n");
		System.out.println("\t1. File Filenames arranged in ascending order \n");
		System.out.println("\t2. File management menu \n");
		System.out.println("\t3. Exit \n");

		option=sc.nextInt();
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("File operation");
			System.out.println("\t1. Add a file");
			System.out.println("\t2. Delete a file");
			System.out.println("\t3. Searching a file");
			System.out.println("\t4. Exit");

			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exited from the operation...");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application...");
			break;
		default:
			System.out.println("Invalid choice");
		}

		//System.out.println("Press 0 to continue");
		}while(option!=3);

	}
}
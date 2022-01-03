import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Contacts> phoneBook;

		static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		phoneBook = new ArrayList<Contacts>();
		Contacts contact;
		PhoneBook phonebook = new PhoneBook();
		Main main = new Main();
		boolean isExit = false;
		
		while(!isExit) {
			if(phoneBook.isEmpty()) {
				System.out.println("Select your option\\n1. Add Contact" + "\n5. Exit");
		} else {
			System.out.println("Select your option\n1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.View Contacts\n5.Exit");
		}
			int option = sc.nextInt();
			switch(option) {
			
			case 1:
				contact = new Contacts();

				phonebook.getName();
				phonebook.getLastName();
				phonebook.getPhone();
				phonebook.getAddress();
				phonebook.getCity();
				phonebook.getState();
				phonebook.getZip();
				phonebook.getEmail();
				
				phoneBook.add(contact);
				break;
				
			case 2:
				main.editContact();
				break;
				
			case 4:
				main.viewAllContact();
				break;
			}
		}
	}
	
	public void editContact() {
		System.out.println("Please enter a name which you want to edit :");
		String editName = sc.next();
		for(Contacts edit: phoneBook) {
		if(edit.getName() == editName) {
			System.out.println("Enter a New Name :");
			String newName = sc.next();
			edit.setName(newName);
			System.out.println("Name has successfully changed :");
		} else {
			System.out.println("No details found with this Name :");
			}
		}
	}
	
	public void viewAllContact() {
		
		if(phoneBook.isEmpty()) {
			System.out.println("Your PhoneBook is Empty");
		} else {
			for (Contacts view : phoneBook) {
				System.out.println(view);
			}
			
		}
	}
}

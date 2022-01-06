import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Contacts> phoneBook;
	static PhoneBook phonebook = new PhoneBook();
	static Scanner sc = new Scanner(System.in);
	static Contacts contact;
	
	public static void main(String[] args) {
		
		phoneBook = new ArrayList<Contacts>();
		
		
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
				addContacts();
				break;
				
			case 2:
				main.editContact();
				break;
				
			case 3:
				main.removeContact();
				break;
				
			case 4:
				main.viewAllContact();
				break;
				
			}
		}
	}
	
	public void editContact() {
		System.out.println("Please enter a name which you want to edit :");
		String name = sc.next();
		Contacts editContact = null;
		for (int i = 0; i < phoneBook.size(); i++) {
			if(name.equals(phoneBook.get(i).getName())) {
				editContact = phoneBook.get(i);
				
				String isExit = "n";
				
			do {
				System.out.println("Please Enter which you want to edit :\n1.Name\n2.LastName\n3.Phone Number\n4.Address\5.City\n6.State\n7.Zip code\n8.Emailid\n9.Exit");
				int option = sc.nextInt();
				
				switch(option) {
				
				case 1:
					
					System.out.println("Please enter a New name:");
					String newName = sc.next();
					editContact.setName(newName);
					break;
				
				
				case 2:
					System.out.println("Please enter a Last name:");
					String newLastName = sc.next();
					editContact.setLastName(newLastName);
					break;
				
			
				case 3:
					System.out.println("Please enter a Phone Number:");
					String newPhone = sc.next();
					editContact.setPhone(newPhone);
					break;
					
				case 4:
					System.out.println("Please enter a Address:");
					String newAddress = sc.next();
					editContact.setAddress(newAddress);
					break;
					
				case 5:
					System.out.println("Please enter a City:");
					String newCity = sc.next();
					editContact.setCity(newCity);
					break;
					
		
				case 6:
					System.out.println("Please enter a New State:");
					String newState = sc.next();
					editContact.setState(newState);
					break;
					
				case 7:
					System.out.println("Please enter a zip:");
					String newZip = sc.next();
					editContact.setZip(newZip);
					break;
					
				case 8:
					System.out.println("Please enter a zip:");
					String newEmail = sc.next();
					editContact.setZip(newEmail);
					break;
					
				case 9:
					System.out.println("Do you wnat to exit :y/n");
					isExit = sc.next();
					break;
					
				default:
					System.out.println("invalid option");
					break;
				}
			} while(isExit.equalsIgnoreCase("y"));
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
	
	public void exit() {
		System.out.println("Do you want to exit :");
		
	}
	
		
		
	public void removeContact() {
		System.out.println("Please enter a name which you want to remove :");
		String removeName = sc.next();
		Contacts removeContact = null;
		for (int i = 0; i < phoneBook.size(); i++) {
			if(phoneBook.get(i).equals(removeName)) {
				removeContact = phoneBook.remove(i);
				System.out.println("The Contact has successfully deleted :");
			} else {
				System.out.println("No Contact found with this Name :");
				}
		}
	}
	
	
	public static void addContacts() {
		Contacts contact = new Contacts();
		contact.setName(phonebook.getName());
		contact.setLastName(phonebook.getLastName());
		contact.setPhone(phonebook.getPhone());
		contact.setAddress(phonebook.getAddress());
		contact.setCity(phonebook.getCity());
		contact.setState(phonebook.getState());
		contact.setZip(phonebook.getZip());
		contact.setEmail(phonebook.getEmail());
		
		phoneBook.add(contact);
		System.out.println("your contact saved successfully :\n thank you");
		
		}
		
	}


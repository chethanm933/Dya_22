import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Contacts> phoneBook = new ArrayList<Contacts>();

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PhoneBook phonebook = new PhoneBook();
		Main main = new Main();
		
		String add = "y";
		
		do {
		Contacts contact = new Contacts();
		phonebook.getName();
		phonebook.getLastName();
		phonebook.getPhone();
		phonebook.getAddress();
		phonebook.getCity();
		phonebook.getState();
		phonebook.getZip();
		phonebook.getEmail();
		
		phoneBook.add(contact);
		System.out.println("Do you want to add New Contact :y/n");
		add = sc.next();
		
		} while(add.equalsIgnoreCase("y"));
	}
}

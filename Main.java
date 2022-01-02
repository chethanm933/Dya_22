import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Contacts> phoneBook = new ArrayList<Contacts>();

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PhoneBook phonebook = new PhoneBook();
		Contacts contact = new Contacts();
		Main main = new Main();
		
		phonebook.getName();
		phonebook.getLastName();
		phonebook.getPhone();
		phonebook.getAddress();
		phonebook.getCity();
		phonebook.getState();
		phonebook.getZip();
		phonebook.getEmail();
		
		phoneBook.add(contact);
		
	}
}

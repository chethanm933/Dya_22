import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
	
	static Scanner sc = new Scanner(System.in);
	
	Contacts contact = new Contacts(); 
	PhoneBook phonebook = new PhoneBook();
	
	public void getName() {
		System.out.println("Enter a First Name");
		String name = sc.next();
		String namePattern = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern compileName = Pattern.compile(namePattern);
		Matcher nameMatcher = compileName.matcher(name);
		
		while(!nameMatcher.matches()) {
			System.out.println("You Entered an Invalid Name Please Enter it Again");
			name = sc.next();
			nameMatcher = compileName.matcher(name);
		}
		contact.setName(name);
	}
	
	public void getLastName() {
		System.out.println("Enter a Last Name");
		String lastName = sc.next();
		String lastNamePattern = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern compileLastName = Pattern.compile(lastNamePattern);
		Matcher lastNameMatcher = compileLastName.matcher(lastName);
		
		while(!lastNameMatcher.matches()) {
			System.out.println("You Entered an Invalid Last Name Please Enter it Again");
			lastName = sc.next();
			lastNameMatcher = compileLastName.matcher(lastName);
		}
		contact.setLastName(lastName);
	}
	
	
	public void getPhone() {
		System.out.println("Enter a Phone Number");
		String phone = sc.next();
		String phonePattern = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern compilePhone = Pattern.compile(phonePattern);
		Matcher phoneMatcher = compilePhone.matcher(phone);
		
		while(!phoneMatcher.matches()) {
			System.out.println("You Entered an Invalid Phone Number Please Enter it Again");
			phone = sc.next();
			phoneMatcher = compilePhone.matcher(phone);
		}
		contact.setPhone(phone);
	}
	
	public void getAddress() {
		System.out.println("Enter a Address");
		String address = sc.next();
		String addressPattern = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern compileAddress = Pattern.compile(addressPattern);
		Matcher addressMatcher = compileAddress.matcher(address);
		
		while(!addressMatcher.matches()) {
			System.out.println("You Entered an Invalid Address Please Enter it Again");
			address = sc.next();
			addressMatcher = compileAddress.matcher(address);
		}
		contact.setAddress(address);
	}
	
	public void getCity() {
		System.out.println("Enter a City");
		String city = sc.next();
		String cityPattern = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern compileCity = Pattern.compile(cityPattern);
		Matcher cityMatcher = compileCity.matcher(city);
		
		while(!cityMatcher.matches()) {
			System.out.println("You Entered an Invalid City Please Enter it Again");
			city = sc.next();
			cityMatcher = compileCity.matcher(city);
		}
		contact.setCity(city);
	}
	
	public void getZip() {
		System.out.println("Enter a Zip Code");
		String zip = sc.next();
		String zipPattern = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern compileZip = Pattern.compile(zipPattern);
		Matcher zipMatcher = compileZip.matcher(zip);
		
		while(!zipMatcher.matches()) {
			System.out.println("You Entered an Invalid Zip Code Please Enter it Again");
			zip = sc.next();
			zipMatcher = compileZip.matcher(zip);
		}
		contact.setZip(zip);
	}
	
	public void getEmail() {
		System.out.println("Enter a Email-id");
		String email = sc.next();
		String emailPattern = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern compileEmail = Pattern.compile(emailPattern);
		Matcher emailMatcher = compileEmail.matcher(email);
		
		while(!emailMatcher.matches()) {
			System.out.println("You Entered an Invalid Email-id Please Enter it Again");
			email = sc.next();
			emailMatcher = compileEmail.matcher(email);
		}
		contact.setEmail(email);
	}
	
	public void getState() {
		System.out.println("Enter a State");
		String state = sc.next();
		String statePattern = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern compileState = Pattern.compile(statePattern);
		Matcher stateMatcher = compileState.matcher(state);
		
		while(!stateMatcher.matches()) {
			System.out.println("You Entered an Invalid State Please Enter it Again");
			state = sc.next();
			stateMatcher = compileState.matcher(state);
		}
		contact.setState(state);
	}
	
}
	



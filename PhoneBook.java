import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
	
	static Scanner sc = new Scanner(System.in);
	Contacts contact = new Contacts(); 
	
	public String getName() {
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
		return name;
	}
	
	public String getLastName() {
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
		return lastName;
	}
	
	
	public String getPhone() {
		System.out.println("Enter a Phone Number");
		String phone = sc.next();
		String phonePattern = "^(\\+[0-9]{2}\\s{1})?[0-9]{10}$";
		Pattern compilePhone = Pattern.compile(phonePattern);
		Matcher phoneMatcher = compilePhone.matcher(phone);
		
		while(!phoneMatcher.matches()) {
			System.out.println("You Entered an Invalid Phone Number Please Enter it Again");
			phone = sc.next();
			phoneMatcher = compilePhone.matcher(phone);
		}
		return phone;
	}
	
	public String getAddress() {
		System.out.println("Enter a Address");
		String address = sc.next();
		String addressPattern = "^[A-Z,a-z,0-9]{20}$";
		Pattern compileAddress = Pattern.compile(addressPattern);
		Matcher addressMatcher = compileAddress.matcher(address);
		
		while(!addressMatcher.matches()) {
			System.out.println("You Entered an Invalid Address Please Enter it Again");
			address = sc.next();
			addressMatcher = compileAddress.matcher(address);
		}
		return address;
	}
	
	public String getCity() {
		System.out.println("Enter a City");
		String city = sc.next();
		String cityPattern = "^[A-Z,a-z]{5}$";
		Pattern compileCity = Pattern.compile(cityPattern);
		Matcher cityMatcher = compileCity.matcher(city);
		
		while(!cityMatcher.matches()) {
			System.out.println("You Entered an Invalid City Please Enter it Again");
			city = sc.next();
			cityMatcher = compileCity.matcher(city);
		}
		return city;
	}
	
	public String getZip() {
		System.out.println("Enter a Zip Code");
		String zip = sc.next();
		String zipPattern = "^[0-9]{6}$";
		Pattern compileZip = Pattern.compile(zipPattern);
		Matcher zipMatcher = compileZip.matcher(zip);
		
		while(!zipMatcher.matches()) {
			System.out.println("You Entered an Invalid Zip Code Please Enter it Again");
			zip = sc.next();
			zipMatcher = compileZip.matcher(zip);
		}
		return zip;
	}
	
	public String getEmail() {
		System.out.println("Enter a Email-id");
		String email = sc.next();
		String emailPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$\"";
		Pattern compileEmail = Pattern.compile(emailPattern);
		Matcher emailMatcher = compileEmail.matcher(email);
		
		while(!emailMatcher.matches()) {
			System.out.println("You Entered an Invalid Email-id Please Enter it Again");
			email = sc.next();
			emailMatcher = compileEmail.matcher(email);
		}
		return email;
	}
	
	public String getState() {
		System.out.println("Enter a State");
		String state = sc.next();
		String statePattern = "^[A-Z,a-z]{3,15}$";
		Pattern compileState = Pattern.compile(statePattern);
		Matcher stateMatcher = compileState.matcher(state);
		
		while(!stateMatcher.matches()) {
			System.out.println("You Entered an Invalid State Please Enter it Again");
			state = sc.next();
			stateMatcher = compileState.matcher(state);
		}
		return state;
	}
	
	
	
}
	



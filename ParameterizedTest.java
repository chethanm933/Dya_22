import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	PhoneBook phonebook;
	
	private String name;
	private String lastName;
	private String city;
	private String address;
	private String state;
	private String zip;
	private String phone;
	private String email;
	private boolean expectedName;
	private boolean expectedLastName;
	private boolean expectedCity;
	private boolean expectedAddress;
	private boolean expectedState;
	private boolean expectedZip;
	private boolean expectedPhone;
	private boolean expectedEmail;
	
	@Before
	public void initialize() {
		PhoneBook phonebook = new PhoneBook();
	}
	
	public void contactsTest(String name,String lastName,String city, String address, String state, String zip,String phone,String email,boolean expectedName,
	boolean expectedLastName, boolean expectedCity, boolean expectedAddress, boolean expectedState,
	boolean expectedZip, boolean expectedPhone, boolean expectedEmail ) {
		this.name = name;
		this.lastName = lastName;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.state = state;
		this.zip = zip;
		this.address = address;
		this.expectedName = expectedName;
		this.expectedLastName = expectedLastName;
		this.expectedCity = expectedCity;
		this.expectedPhone = expectedPhone;
		this.expectedEmail =expectedEmail;
		this.expectedState = expectedState;
		this.expectedZip =expectedZip;
		this.expectedAddress = expectedAddress;
		
	}
	
	
	@Parameterized.Parameters
	public static Collection inputs() {
		return Arrays.asList(new Object[][] {
				{ "", "", "", "", false, false, false, false },
				{ "Chethan", "", "+91 8971913083", "aaa@gmail.com",
						false, false, false, false } });
		
	}
	
	@Test
	public void validateFirstName() {
		assertEquals(expectedName,
				phonebook.getName());
	}

	@Test
	public void validateLastName() {
		assertEquals(expectedLastName,
				phonebook.getLastName());
	}

	@Test
	public void validateCity() {
		assertEquals(expectedCity,
					phonebook.getCity());
	}

	@Test
	public void validateEmailId() {
		assertEquals(expectedEmail,
				phonebook.getEmail());
	}


	@Test
	public void validateAddress() {
		assertEquals(expectedAddress,
				phonebook.getAddress());
	}
	

	@Test
	public void validateState() {
		assertEquals(expectedState,
				phonebook.getState());
	}
	

	@Test
	public void validatePhone() {
		assertEquals(expectedPhone,
				phonebook.getPhone());
	}

	@Test
	public void validateZip() {
		assertEquals(expectedZip,
				phonebook.getZip());
	}
		
	}


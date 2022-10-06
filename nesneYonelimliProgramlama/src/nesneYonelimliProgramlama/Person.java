package nesneYonelimliProgramlama;

public class Person extends Customer {
	private String firstName;
	private String lastName;
	private String nationalIdentity;

	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNationalIdentity() {
		return nationalIdentity;
	}
}
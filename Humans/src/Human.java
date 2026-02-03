public class Human {
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private String firstName;
	private String lastName;
	private Gender gender;
	
	public Human(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender) {
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public int getBirthMonth() {
		return birthMonth;
	}
	
	public int getBirthDay() {
		return birthDay;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
}

import java.time.*;

public class Human {
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private String firstName;
	private String lastName;
	private Gender gender;
	
	private static final int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31}; //zero days in month 0
	
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
	
	public Gender getGender() {
		return gender;
	}
	
	public int calculateCurrentAgeInYears() {
		LocalDateTime time = LocalDateTime.now();
		
		int currentYear = time.getYear();
		int currentMonth = time.getMonthValue();
		int currentDay = time.getDayOfMonth();
		
		int years = currentYear - birthYear;
		if (years)
	}
}

import java.time.*;

public class Human {
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private String firstName;
	private String lastName;
	private Gender gender;
	
	private static final int[] DAYS_IN_MONTHS = {0,31,28,31,30,31,30,31,31,30,31,30,31}; //zero days in month 0
	private static final int MONTHS_IN_YEAR = 12;
	
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
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public void setLastName(String name) {
		lastName = name;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public int calculateCurrentAgeInYears() {
		LocalDateTime time = LocalDateTime.now();
		
		int currentYear = time.getYear();
		int currentMonth = time.getMonthValue();
		int currentDay = time.getDayOfMonth();
		
		int days = 0;
		int months = 0;
		int years = 0;
		
		if (currentDay < birthDay) {
			currentDay += DAYS_IN_MONTHS[currentMonth];
			currentMonth--;
		}
		
		if (currentMonth < birthMonth) {
			currentMonth += MONTHS_IN_YEAR;
			currentYear--;
			months = currentMonth - birthMonth;
		}
		
		years = currentYear - birthYear;
		return years;
	}
}

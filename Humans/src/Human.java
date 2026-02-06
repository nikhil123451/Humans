import java.time.*;
import java.util.Comparator;

public class Human implements Comparable<Human>{
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private String firstName;
	private String lastName;
	private Gender gender;
	
	private static final int[] DAYS_IN_MONTHS = {31,31,28,31,30,31,30,31,31,30,31,30,31}; //0th month refers to the December of the year prior
	private static final int MONTHS_IN_YEAR = 12;
	
	public static Comparator<Human> AGE_ORDER = new AgeOrder();
	public static Comparator<Human> NAME_ORDER = new NameOrder();
	public static Comparator<Human> ASSEMBLY_ORDER = new AssemblyOrder();
	
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
		return calculateCurrentAge()[0];
	}
	
	public int[] calculateCurrentAge() {
		LocalDateTime time = LocalDateTime.now();
		
		int currentYear = time.getYear();
		int currentMonth = time.getMonthValue();
		int currentDay = time.getDayOfMonth();
		
		int days = 0;
		int months = 0;
		int years = 0;
		
		if (currentDay < birthDay) {
			currentDay += DAYS_IN_MONTHS[currentMonth - 1];
			currentMonth--;
		}
		
		days = currentDay - birthDay;
		
		if (currentMonth < birthMonth) {
			currentMonth += MONTHS_IN_YEAR;
			currentYear--;
		}
		
		months = currentMonth - birthMonth;
		years = currentYear - birthYear;
		return new int[]{years, months, days};
	}

	public int compareTo(Human human) {
		String name = getLastName();
		String otherName = human.getLastName();
		int[] age = calculateCurrentAge();
		int[] otherAge = human.calculateCurrentAge();
		
		//age arrays are in the format {years, months, days}
		if (age[0] == otherAge[0]) {
			
			if (age[1] == otherAge[1]) {
				
				if (age[2] == otherAge[2]) { //born on the same day
					return 0;
				} else {
					return otherAge[2] - age[2];
				}
				
			} else {
				return otherAge[1] - age[1];
			}
			
		} else {
			return otherAge[0] - age[0];
		}
	}
}

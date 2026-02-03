public class Youth extends Human{
	private int schoolGrade;
	private String schoolName;

	public Youth(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender,
			int schoolGrade, String schoolName) {
		
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
		
		this.schoolGrade = schoolGrade;
		this.schoolName = schoolName;
	}

}

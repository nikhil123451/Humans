public class WilliamAberhartStudent extends Youth{
	private int homeRoom;
	private String homeRoomTeacher;
	private final String schoolName = "William Aberhart High School";

	public WilliamAberhartStudent(int birthYear, int birthMonth, int birthDay, String firstName, String lastName,
			Gender gender, int schoolGrade, int homeRoom, String homeRoomTeacher) {
		
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender, schoolGrade, "William Aberhart High School");
		
		this.homeRoom = homeRoom;
		this.homeRoomTeacher = homeRoomTeacher;
	}

}

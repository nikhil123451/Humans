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
	
	public int getHomeRoom() {
		return homeRoom;
	}
	
	public String getHomeRoomTeacher() {
		return homeRoomTeacher;
	}
	
	public String getShoolName() {
		return schoolName;
	}
	
	public void setHomeRoom(int roomNumber) {
		homeRoom = roomNumber;
	}
	
	public void setHomeRoomTeacher(String teacher) {
		homeRoomTeacher = teacher;
	}
	
	public void setSchoolName(String name) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
}

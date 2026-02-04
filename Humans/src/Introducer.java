public class Introducer {
	
	public String createPublicIntroduction(Human person) {
		StringBuilder sb = new StringBuilder();
		
		try {
			
			
			sb.append("I am pleased to introduce ");
			sb.append(person.getFirstName() + " " + person.getLastName() + ".");
			
			String pronoun;
			
			if (person.getGender().equals(Gender.MALE)) {
				pronoun = "He";
			} else {
				pronoun = "She";
			}
			
			if (person instanceof Adult) {
				sb.append(" " + pronoun + " works at " + ((Adult) person).getPlaceOfWork());
				sb.append(" and their occupation is " + ((Adult) person).getOccupation() + ".");
				
			} else if (person instanceof Youth) {
				sb.append(" " + pronoun + " goes to " + ((Youth) person).getSchoolName());
				sb.append(" and is in grade " + ((Youth) person).getSchoolGrade() + ".");
				
				if (person instanceof WilliamAberhartStudent){
					
					String homeRoomTeacher = ((WilliamAberhartStudent) person).getHomeRoomTeacher();
					
					if (!(homeRoomTeacher == null)) {
						sb.append(" " + pronoun + " belongs to " + homeRoomTeacher + "'s homeroom,");
						sb.append(" which is in room " + Integer.toString(((WilliamAberhartStudent) person).getHomeRoom()) + ".");
					} else {
						sb.append(" Their homeroom is unknown at this time.");
					}
				}
			}
			
			
		} catch (Exception e) {
			sb.setLength(0); //clear the StringBuilder
			sb.append("This person has issues and can't be introduced.");
		}
		
		return sb.toString();
		
	}
}

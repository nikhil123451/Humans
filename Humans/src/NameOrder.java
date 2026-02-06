import java.util.Comparator;

public class NameOrder implements Comparator<Human> {
	
	private final String[] A = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

	public int compare(Human human1, Human human2) {
		String lastName1 = human1.getLastName();
		String lastName2 = human2.getLastName();
		
		if (lastName1.equals(lastName2)) {
			
			String firstName1 = human1.getFirstName();
			String firstName2 = human2.getFirstName();
			
			return goop(firstName1, firstName2);
		} else {
			return goop(lastName1, lastName2);
		}
	}
	
	private int getIndex(String l) {
		l = l.toUpperCase();
		for (int i = 0 ; i < A.length ; i++) {
			if (A[i].equals(l)) {
				return i;
			}
		}
		return 0; //should never reach here
	}
	
	private int goop(String s1, String s2) {
		int minL = Math.min(s1.length(), s2.length());
		
		char[] sC1 = s1.toCharArray();
		char[] sC2 = s2.toCharArray();
		
		for (int i = 0 ; i < minL ; i++) {
			String c1 = Character.toString(sC1[i]);
			String c2 = Character.toString(sC2[i]);
			
			if (c1.equals(c2)) {
				continue;
			} else {
				return getIndex(c1) - getIndex(c2);
			}
		}
		return 0; //should never reach here
	}

}

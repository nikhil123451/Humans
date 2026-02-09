import java.util.Comparator;

public class NameOrder implements Comparator<Human> {
	
	private static final String[] ALPHABET = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

	public int compare(Human human1, Human human2) {
		String lastName1 = human1.getLastName();
		String lastName2 = human2.getLastName();
		
		if (lastName1.equals(lastName2)) {
			
			String firstName1 = human1.getFirstName();
			String firstName2 = human2.getFirstName();
			
			return compareNames(firstName1, firstName2);
		} else {
			return compareNames(lastName1, lastName2);
		}
	}
	
	private int getIndex(String letter) {
		letter = letter.toUpperCase();
		for (int i = 0 ; i < ALPHABET.length ; i++) {
			if (ALPHABET[i].equals(letter)) {
				return i;
			}
		}
		return 0; //should never reach here
	}
	
	private int compareNames(String string1, String string2) {
		int minimumLength = Math.min(string1.length(), string2.length());
		
		char[] stringCharacters1 = string1.toCharArray();
		char[] stringCharacters2 = string2.toCharArray();
		
		for (int i = 0 ; i < minimumLength ; i++) {
			String character1 = Character.toString(stringCharacters1[i]);
			String character2 = Character.toString(stringCharacters2[i]);
			
			if (character1.equals(character2)) {
				continue;
			} else {
				return getIndex(character1) - getIndex(character2);
			}
		}
		
		return string1.length() - string2.length(); //compare lengths if one of the strings contain the other at the start (ex. Smith and Smith-Jones)
	}
}

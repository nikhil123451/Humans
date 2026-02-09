import java.util.Comparator;

public class AssemblyOrder implements Comparator<Human> {
	
	private static Comparator<Human> nameOrder = new NameOrder();
	
	private final static int ABERHART_STUDENT_VALUE = 0;
	private final static int YOUTH_VALUE = 1;
	private final static int ADULT_VALUE = 2;
	private final static int HUMAN_VALUE = 3;

	public int compare(Human human1, Human human2) {
		if (getClassValue(human1) == getClassValue(human2)) {
			return nameOrder.compare(human1, human2);
		} else {
			return getClassValue(human1) - getClassValue(human2);
		}
	}
	
	private int getClassValue(Human human) {
		String className = human.getClass().getName();
		
		if (className.equals("WilliamAberhartStudent")) {
			return ABERHART_STUDENT_VALUE;
		} else if (className.equals("Youth")) {
			return YOUTH_VALUE;
		} else if (className.equals("Adult")) {
			return ADULT_VALUE;
		} else if (className.equals("Human")) {
			return HUMAN_VALUE;
		} else {
			return -1; //should never reach here
		}
	}

}

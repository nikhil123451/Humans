import java.util.Comparator;

public class AgeOrder implements Comparator<Human>{

	public int compare(Human human1, Human human2) {
		return human1.compareTo(human2);
	}

}

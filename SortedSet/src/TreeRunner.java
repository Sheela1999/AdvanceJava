import java.util.TreeSet;

public class TreeRunner {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Apple");
		set.add("Mango");
		set.add("Orange");
		set.add("Banana");
		set.add("Kiwi");
		set.add("Cherry");
		set.add("Grapes");
		set.add("papaya");//it is starting with small letter so its comes inlast
		set.add("Guava");
		set.add("WaterMelon");
		set.add("Strawberry");
		
		for(String str: set) {
			System.out.println(str);
		}
		
		System.out.println(set);

	}

}

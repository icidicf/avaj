import java.util.*;

public class sort_input_string {
	public static void main (String[] args) {
		List<String> list = Arrays.asList(args);
		List<Integer> intlist = new ArrayList<Integer>();
		for (String it : list) {
			intlist.add(Integer.decode(it));
		}
		Collections.sort(intlist);
		System.out.println(intlist);
	}
}

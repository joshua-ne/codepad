import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		Queue<String> queue = new ArrayDeque<>();

		String[] deads = new String[] {"8887","8889","8878","8898","8788","8988","7888","9888"};

		for (String s : deads) {
			set.add(s);
			queue.add(s);
		}

		System.out.println((int) Math.sqrt(13));


	}
}
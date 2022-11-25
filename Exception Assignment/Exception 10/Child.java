package Exception_Q10;

import java.util.Arrays;

public class Child extends Parent {
	void largest(int[] a) {
		try {
			System.out.println("Child class");
			Arrays.sort(a);

		} catch (NumberFormatException | NullPointerException e) {
			System.out.println(e);
		}

	}
}

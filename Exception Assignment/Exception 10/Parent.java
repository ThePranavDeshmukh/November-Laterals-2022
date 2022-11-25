package Exception_Q10;

import java.util.Arrays;

/*You are giving two classes one is parent class and second is child class parent class having the 
method calculate maximum from the list of given array. The method is overridden in the child class. 
In child class the method is use to print the average of number along with maximum number. In 
parent class method throws the NullPointerException and ArrayIndexOfBoundsException. In child 
class it throws the NumberFormateException and NullPointerException. You have to make sure 
that exception handling by overriding should be take place in proper way.*/

public class Parent {
	Main m = new Main();

	void largest(int[] a) {
		try {
			System.out.println("Parent class");
			Arrays.sort(a);

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e);
		}

	}
}

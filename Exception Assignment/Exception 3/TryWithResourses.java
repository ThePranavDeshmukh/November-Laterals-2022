//WAP to demonstrate use of try with resources

package Exception_3;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourses {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\test.txt");
		FileInputStream fis = new FileInputStream("D:\\test.txt");

		try(Scanner sc = new Scanner(fis)) {
			fw.write("Hello Java Program Here");

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
}
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			fw.close();
			fis.close();
			
			System.out.println("Resource are closed and message has been written into the D:\\test.txt");
		}
	}
}

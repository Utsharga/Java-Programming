package cas.lab5.wt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("data/input.txt"));
		while (input.hasNext()) {
			String current = input.next();
			System.out.println(current);
		}
		input.close();
	}

}

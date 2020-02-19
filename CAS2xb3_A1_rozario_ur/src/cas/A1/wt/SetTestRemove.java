package cas.A1.wt;

/* Student Information
* -------------------
* Student Name: Rozario, Utsharga
* Student Number: 400213114
* Course Code: CS/SE 2XB3
* Lab Section: 01
*
* I attest that the following code being submitted is my own individual
work.
*/

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SetTestRemove {
	private Set set1;
	private Set set2;
	private Set set3;
	private Set set4;
	private Set set5;
	private Set set6;
	private Set set7;
	private Set set8;
	private Set set9;
	private Set set10;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {		
		try {
			File read = new File("input.txt");
			Scanner s = new Scanner(read);
			
			String Sarr1 = s.nextLine();
			String Sarr2 = s.nextLine();
			String Sarr3 = s.nextLine();
			String Sarr4 = s.nextLine();
			String Sarr5 = s.nextLine();
			String Sarr6 = s.nextLine();
			String Sarr7 = s.nextLine();
			String Sarr8 = s.nextLine();
			String Sarr9 = s.nextLine();
			String Sarr10 = s.nextLine();
			
			
			String[] arrOfStr1 = Sarr1.split(",", 20);
			String[] arrOfStr2 = Sarr2.split(",", 20);
			String[] arrOfStr3 = Sarr3.split(",", 20);
			String[] arrOfStr4 = Sarr4.split(",", 20);
			String[] arrOfStr5 = Sarr5.split(",", 20);
			String[] arrOfStr6 = Sarr6.split(",", 20);
			String[] arrOfStr7 = Sarr7.split(",", 20);
			String[] arrOfStr8 = Sarr8.split(",", 20);
			String[] arrOfStr9 = Sarr9.split(",", 20);
			String[] arrOfStr10 = Sarr10.split(",", 20);
			
			set1 = new Set(arrOfStr1);
			set2 = new Set(arrOfStr2);
			set3 = new Set(arrOfStr3);
			set4 = new Set(arrOfStr4);
			set5 = new Set(arrOfStr5);
			set6 = new Set(arrOfStr6);
			set7 = new Set(arrOfStr7);
			set8 = new Set(arrOfStr8);
			set9 = new Set(arrOfStr9);
			set10 = new Set(arrOfStr10);
			s.close();
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRemove() {
		String[] st1 = {"b", "c", "d", "e", "f", "g", "h", "i", "j"};
		String[] st2 = {"a", "b", "c", "d", "e"};
		String[] st3 = {"5", "6", "7", "8", "9"};
		String[] st4 = {};
		String[] st5 = {"A", "B", "D", "E", "F", "G", "H", "I", "J"};
		Set eq1 = new Set(st1);
		Set eq2 = new Set(st2);
		Set eq3 = new Set(st3);
		Set eq4 = new Set(st4);
		Set eq5 = new Set(st5);
		Set remove1 = set1.Remove("a");
		Set remove2 = set3.Remove("k");
		Set remove3 = set6.Remove("0");
		Set remove4 = set7.Remove("A");
		Set remove5 = set9.Remove("C");
		
		try {
			File file = new File("output.txt");
			FileWriter f = new FileWriter(file, true);
			f.write("Entering testRemove...\n");
			assertTrue(remove1.isEqual(eq1));
			f.write("Test case 1 passed\n");
			assertTrue(remove2.isEqual(eq2));
			f.write("Test case 2 passed\n");
			assertTrue(remove3.isEqual(eq3));
			f.write("Test case 3 passed\n");
			assertTrue(remove4.isEqual(eq4));
			f.write("Test case 4 passed\n");
			assertTrue(remove5.isEqual(eq5));
			f.write("Test case 5 passed\n");
			f.write("testRemove complete\n");
			f.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
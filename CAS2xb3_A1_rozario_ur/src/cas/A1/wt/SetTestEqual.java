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

public class SetTestEqual {
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

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEqual() {
		String[] st1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		String[] st2 = {"j", "i", "h", "g", "f", "e", "d", "c", "b", "a"};
		String[] st3 = {"a", "b", "c", "d", "e"};
		String[] st4 = {"a", "b", "g", "h", "k", "l", "m", "n", "o", "p"};
		String[] st5 = {"0", "1", "2", "3", "4", "5"};
		String[] st6 = {"5", "6", "7", "8", "9", "0"};
		String[] st7 = {};
		String[] st8 = {"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] st9 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		String[] st10 = {"D"};
		Set eq1 = new Set(st1);
		Set eq2 = new Set(st2);
		Set eq3 = new Set(st3);
		Set eq4 = new Set(st4);
		Set eq5 = new Set(st5);
		Set eq6 = new Set(st6);
		Set eq7 = new Set(st7);
		Set eq8 = new Set(st8);
		Set eq9 = new Set(st9);
		Set eq10 = new Set(st10);
		
		try {
			File file = new File("output.txt");
			FileWriter f = new FileWriter(file, true);
			f.write("Entering testisEqual...\n");
			assertTrue(set1.isEqual(eq1));
			f.write("Test case 1 passed\n");
			assertTrue(set2.isEqual(eq2));
			f.write("Test case 2 passed\n");
			assertTrue(set3.isEqual(eq3));
			f.write("Test case 3 passed\n");
			assertTrue(set4.isEqual(eq4));
			f.write("Test case 4 passed\n");
			assertTrue(set5.isEqual(eq5));
			f.write("Test case 5 passed\n");
			assertTrue(set6.isEqual(eq6));
			f.write("Test case 6 passed\n");
			assertTrue(set7.isEqual(eq7));
			f.write("Test case 7 passed\n");
			assertTrue(set8.isEqual(eq8));
			f.write("Test case 8 passed\n");
			assertTrue(set9.isEqual(eq9));
			f.write("Test case 9 passed\n");
			assertTrue(set10.isEqual(eq10));
			f.write("Test case 10 passed\n");
			assertTrue(set1.isEqual(eq2));
			f.write("Test case 11 passed\n");
			assertTrue(!set1.isEqual(eq9));
			f.write("Test case 12 passed\n");
			assertTrue(!set1.isEqual(eq3));
			f.write("Test case 13 passed\n");
			f.write("testisEqual complete\n");
			f.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

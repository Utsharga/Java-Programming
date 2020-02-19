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

public class SetTestAdd {
	private Set set1;
	private Set set2;
	private Set set3;
	private Set set4;
	private Set set5;
	private Set set6;
	private Set set7;

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
			
			String[] arrOfStr1 = Sarr1.split(",", 20);
			String[] arrOfStr2 = Sarr2.split(",", 20);
			String[] arrOfStr3 = Sarr3.split(",", 20);
			String[] arrOfStr4 = Sarr4.split(",", 20);
			String[] arrOfStr5 = Sarr5.split(",", 20);
			String[] arrOfStr6 = Sarr6.split(",", 20);
			String[] arrOfStr7 = Sarr7.split(",", 20);

			set1 = new Set(arrOfStr1);
			set2 = new Set(arrOfStr2);
			set3 = new Set(arrOfStr3);
			set4 = new Set(arrOfStr4);
			set5 = new Set(arrOfStr5);
			set6 = new Set(arrOfStr6);
			set7 = new Set(arrOfStr7);
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
	public void testAdd() {
		String[] st1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
		String[] st2 = {"a", "b", "c", "d", "e"};
		String[] st3 = {"0", "1", "2", "3", "4", "5"};
		String[] st4 = {"A"};
		String[] st5 = {"A", "6"};
		Set eq1 = new Set(st1);
		Set eq2 = new Set(st2);
		Set eq3 = new Set(st3);
		Set eq4 = new Set(st4);
		Set eq5 = new Set(st5);
		Set add1 = set1.Add("k");
		Set add2 = set3.Add("d");
		Set add3 = set5.Add("0");
		Set add4 = set7.Add("A");
		Set add5 = add4.Add("6");
		
		try {
			File file = new File("output.txt");
			FileWriter f = new FileWriter(file, true);
			f.write("Entering testAdd...\n");
			assertTrue(add1.isEqual(eq1));
			f.write("Test case 1 passed\n");
			assertTrue(add2.isEqual(eq2));
			f.write("Test case 2 passed\n");
			assertTrue(add3.isEqual(eq3));
			f.write("Test case 3 passed\n");
			assertTrue(add4.isEqual(eq4));
			f.write("Test case 4 passed\n");
			assertTrue(add5.isEqual(eq5));
			f.write("Test case 5 passed\n");
			f.write("testAdd complete\n");
			f.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

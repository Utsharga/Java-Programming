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

public class SetTestgetCount {
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
	public void testGetCount() {
		try {
			File file = new File("output.txt");
			FileWriter fr = new FileWriter(file, true);
			fr.write("Entering testgetCount...\n");
			assertEquals(set1.getCount(), 10);
			fr.write("Test case 1 passed\n");
			assertEquals(set2.getCount(), 10);
			fr.write("Test case 2 passed\n");
			assertEquals(set3.getCount(), 5);
			fr.write("Test case 3 passed\n");
			assertEquals(set4.getCount(), 10);
			fr.write("Test case 4 passed\n");
			assertEquals(set5.getCount(), 6);
			fr.write("Test case 5 passed\n");
			assertEquals(set6.getCount(), 6);
			fr.write("Test case 6 passed\n");
			assertEquals(set7.getCount(), 0);
			fr.write("Test case 7 passed\n");
			assertEquals(set8.getCount(), 20);
			fr.write("Test case 8 passed\n");
			assertEquals(set9.getCount(), 10);
			fr.write("Test case 9 passed\n");
			assertEquals(set10.getCount(), 1);
			fr.write("Test case 10 passed\n");
			fr.write("testgetCount completed\n");
			fr.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

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

import cas.A1.wt.Set;

public class SetTestProduct {
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
	public void testProduct() {
		String st1 = "{aj,ai,ah,ag,af,ae,ad,ac,ab,aa,"
				+ "bj,bi,bh,bg,bf,be,bd,bc,bb,ba,"
				+ "cj,ci,ch,cg,cf,ce,cd,cc,cb,ca,"
				+ "dj,di,dh,dg,df,de,dd,dc,db,da,"
				+ "ej,ei,eh,eg,ef,ee,ed,ec,eb,ea,"
				+ "fj,fi,fh,fg,ff,fe,fd,fc,fb,fa,"
				+ "gj,gi,gh,gg,gf,ge,gd,gc,gb,ga,"
				+ "hj,hi,hh,hg,hf,he,hd,hc,hb,ha,"
				+ "ij,ii,ih,ig,if,ie,id,ic,ib,ia,"
				+ "jj,ji,jh,jg,jf,je,jd,jc,jb,ja}";
		String st2 = "{}";
		String st3 = "{05,06,07,08,09,00,15,16,17,18,19,10,25,26,27,28,29,20,35,36,37,38,39,30,45,46,47,48,49,40,55,56,57,58,59,50}";
		String st4 = "{ja,jb,jg,jh,jk,jl,jm,jn,jo,jp,"
				+ "ia,ib,ig,ih,ik,il,im,in,io,ip,"
				+ "ha,hb,hg,hh,hk,hl,hm,hn,ho,hp,"
				+ "ga,gb,gg,gh,gk,gl,gm,gn,go,gp,"
				+ "fa,fb,fg,fh,fk,fl,fm,fn,fo,fp,"
				+ "ea,eb,eg,eh,ek,el,em,en,eo,ep,"
				+ "da,db,dg,dh,dk,dl,dm,dn,do,dp,"
				+ "ca,cb,cg,ch,ck,cl,cm,cn,co,cp,"
				+ "ba,bb,bg,bh,bk,bl,bm,bn,bo,bp,"
				+ "aa,ab,ag,ah,ak,al,am,an,ao,ap}";
		String st5 = "{DA,DB,DC,DD,DE,DF,DG,DH,DI,DJ}";
		Set prod1 = set1.Product(set2);
		Set prod2 = set3.Product(set7);
		Set prod3 = set5.Product(set6);
		Set prod4 = set2.Product(set4);
		Set prod5 = set10.Product(set9);
		
		try {
			File file = new File("output.txt");
			FileWriter fr = new FileWriter(file, true);
			fr.write("Entering testProduct...\n");
			assertEquals(prod1.toString(), st1);
			fr.write("Test case 1 passed\n");
			assertEquals(prod2.toString(), st2);
			fr.write("Test case 2 passed\n");
			assertEquals(prod3.toString(), st3);
			fr.write("Test case 3 passed\n");
			assertEquals(prod4.toString(), st4);
			fr.write("Test case 4 passed\n");
			assertEquals(prod5.toString(), st5);
			fr.write("Test case 5 passed\n");
			fr.write("testProduct completed\n");
			fr.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

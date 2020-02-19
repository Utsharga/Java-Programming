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

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SetTestDifference.class, SetTestEqual.class, SetTestgetCount.class, SetTestIntersection.class,
		SetTestisSubset.class, SetTestProduct.class, SetTesttoString.class, SetTestUnion.class, SetTestAdd.class,
		SetTestRemove.class, SetTestMember.class})
public class testSet {

}

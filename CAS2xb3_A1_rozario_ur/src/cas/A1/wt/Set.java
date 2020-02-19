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

import java.util.ArrayList;
import java.util.Arrays;

public class Set {
	//set state variables
	private final ArrayList<String> set = new ArrayList<String>();
	
	/**
	 * @brief Constructor for array of strings
	 * @details Has case handling for empty set taken from a test file
	 * Iterates through each element in parameter arr and adds it to the set 
	 * @param arr A list of strings
	 */
	public Set(String[] arr) {
		String[] arrEmpty = {""};
		if (Arrays.toString(arr).equals(Arrays.toString(arrEmpty))) {
			this.set.clear();
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (!this.set.contains(arr[i])) {
					this.set.add(arr[i]);
				}
			}
		}
	}
	
	/**
	 * @brief Constructor for ArrayList<String>
	 * @details Iterates through each element in parameter arr and adds it to the set 
	 * @param arr A list of strings
	 */
	public Set(ArrayList<String> arr) {
		for (int i = 0; i < arr.size(); i++) {
			if (!this.set.contains(arr.get(i))) {
				this.set.add(arr.get(i));
			}
		}
	}
	
	/**
	 * @brief Constructor for empty set
	 */
	public Set() {
		this.set.clear();
	}
	
	/**
	 * @brief Method to add an element to the set
	 * @param s A String of length one to be added to the set 
	 * @return u A new Set containing the added element to the current set
	 */
	public Set Add(String s) {
		ArrayList<String> u = new ArrayList<String>(this.set);
		if (!u.contains(s)) {
			u.add(s);
		}
		return new Set(u);
	}
	
	/**
	 * @brief Method to remove an element from the set
	 * @details Checks if the element in in the set, if it is then it proceeds to remove it 
	 * @param s A String of length one to be removed from the set 
	 * @return u A new Set with the element removed from the current set
	 */
	public Set Remove(String s) {
		ArrayList<String> u = new ArrayList<String>(this.set);
		if (u.contains(s)) {
			u.remove(s);
		}
		return new Set(u);
	}
	
	/**
	 * @brief Method to find an element in the set
	 * @param s A String of length one which is to be searched for 
	 * @return True if the element in set, false otherwise 
	 */
	public boolean Member(String s) {
		return this.set.contains(s);
	}

	/**
	 * @brief Method to unify this set with another set
	 * @details Duplicates this set and then adds each member of the other set
	 * to the duplicated set 
	 * @param S A Set data type with which this set will be unified 
	 * @return A set with the unified elements
	 */
	public Set Union(Set S) {
		Set u = new Set(this.set);
		for (int i = 0; i < S.getCount(); i++) {
			u = u.Add(S.set.get(i));
		}
		return u;
	}
	
	/**
	 * @brief Method to get the intersecting elements of this set and another set
	 * @details Makes a new set, iterates through this set and if it is present
	 * in the other set it, adds the element to the new set
	 * @param S A Set data type with which this set will be intersected
	 * @return A set with the intersecting elements
	 */
	public Set Intersection(Set S) {
		Set inter = new Set();
		for (int i = 0; i < this.getCount(); i ++) {
			if (S.set.contains(this.set.get(i))) {
				inter = inter.Add(this.set.get(i));
			}
		}
		return inter;
	}
	
	//Method to get the difference of this set with another set, the
	//elements in this set not present in the other set
	/**
	 * @brief Method to get the difference of this set with another set
	 * @details Checks if this set contains the elements in the parameter set,
	 * if it doesn't, it adds it to a new set which is returned at the end of
	 * the program 
	 * @param S A Set data type with which this set will be checked for difference
	 * @return A set with the difference elements
	 */
	public Set Difference(Set S) {
		Set diff = new Set();
		for (int i = 0; i < this.getCount(); i ++) {
			if (!S.set.contains(this.set.get(i))) {
				diff = diff.Add(this.set.get(i));
			}
		}
		return diff;
	}
	
	/**
	 * @brief Method to get Cartesian product between this set and another set
	 * @details Creates a set of all possible permutation between the elements of the
	 * two sets, this is done by iterating through each element of both sets and concatenating
	 * the two elements and storing them
	 * @param S A Set data type with which this set will produce a product set
	 * @return A set containing the product set
	 */
	public Set Product(Set S) {
		Set prod = new Set();
		for (int i = 0; i < this.getCount(); i++) {
			for (int j = 0; j < S.getCount(); j++) {
				prod = prod.Add(this.set.get(i) + S.set.get(j));
			}
		}
		return prod;
	}
	
	/**
	 * @brief Method to check if this set and another set is equal
	 * @param S A Set data type with which this set checked for equality
	 * @return True if the sets are equal, false otherwise 
	 */
	public boolean isEqual(Set S) {
		return this.set.containsAll(S.set) && S.set.containsAll(this.set);
	}

	/**
	 * @brief Method to check if this set is a subset of another set
	 * @param S A Set data type with which this set will be checked for being a subset
	 * @return True if this set is a subset of parameter set, false otherwise 
	 */
	public boolean isSubset(Set S) {
		return S.set.containsAll(this.set);
	}
	
	/**
	 * @brief Method to get the number of elements in the set
	 * @return Size of the set
	 */
	public int getCount() {
		return this.set.size();
	}

	/**
	 * @brief Method that returns a string representing the elements in the set
	 * @return A string of all the elements in the set in the format {elem1, elem2,...., elemN}
	 */
	public String toString() {
		String s = "{";
		for (int i = 0; i < this.getCount(); i++) {
			s += this.set.get(i);
			if (i != this.getCount() - 1)
				s += ",";
		}
		s += "}";
		return s;
	}
}


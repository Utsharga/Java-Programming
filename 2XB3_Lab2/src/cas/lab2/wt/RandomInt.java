package cas.lab2.wt;

public class RandomInt {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		double r = Math.random(); //0 - 1
		int value = (int) (r * n);
		System.out.println(value);
	}
}

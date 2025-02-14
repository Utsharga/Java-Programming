package cas.lab4.wt;

public class PotentialGame {
	
	public static boolean isPotentialGene(String dna){
		if (dna.length() % 3 != 0) {
			return false;
		}
		else if (!dna.startsWith("ATG"))
		return false;
		
		for (int i = 3; i < dna.length(); i++) {
			if (i % 3 == 0){
				String codon = dna.substring(i, i+3);
				if ((codon.equals("TAA") || codon.equals("TAG")) || codon.equals("TGA")){
					return false;
				}
			}
		}
		if(dna.endsWith("TAA")) return true;
		if(dna.endsWith("TAG")) return true;
		if(dna.endsWith("TGA")) return true;
		
		return false;
		
	}

	public static void main(String[] args) {
		String dna= args[0];
		System.out.println(isPotentialGene(dna));
	}

}

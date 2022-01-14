import java.math.BigInteger;

public class Dictionnaire {
	
	private HTNaive h;

	public Dictionnaire(int m) {
		this.h = new HTNaive[m];
	}

	public String toString() {
		return this.h.toString();
	}

	public String toStringV2() {
		return this.h.toStringV2();
	}

	private static BigInteger stringToBigInteger(String s) {
		int x = 0;
		for(int i = 0; i < s.length(); i++) {
			x += s.charAt(i);
		}
		return BigInteger.valueOf(x);
	}

	public boolean ajout(String s) {
		return this.h.ajout(stringToBigInteger(s));
	}

	public boolean contient(String s) {
		return this.h.contient(stringToBigInteger(s));
	}

	public int getCardinal() {
		return this.h.getCardinal();
	}

	public int getMaxSize() {
		return this.h.getMaxSize();
	}

	public int getNbListes() {
		return this.h.getNbListes();
	}
}
import java.math.BigInteger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionnaire {
	
	private HTNaive h;

	public Dictionnaire(int m) {
		this.h = new HTNaive[m];
	}

	public Dictionnaire(String fileName, int m) {
		this(m);
		this.h.ajoutListe(calculeListeInt(fileName));
	}

	public Dictionnaire(String fileName, double f) {
		HTNaive temp = new HTNaive(calculeListeInt(fileName, 1000));
        this(fileName, (int)(temp.getCardinal() * f));
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

	public static ListeBigI calculeListeInt(String fileName) {
		File f = new File(fileName);
		ListeBigI res = new ListeBigI();
		Scanner sc;
		String mot;
		try {
			sc = new Scanner(f);
		}
		catch(FileNotFoundException e){
			System.out.println(("problème d'accès au fichier " + e.getMessage()));
			return res;
		}
		sc.useDelimiter(" |\\n|,|;|:|\\.|!|\\?|-");

		while(sc.hasNext()) {
			mot = sc.next();
			res.ajoutTete(stringToBigInteger(mot));
		}
		return res;
	}
}
class MainDictionnaire {
	public static void main(String args[]) {
		Dictionnaire d = new Dictionnaire(1000);
		char[] mot;
		int tailleMot
		String motS;
		System.out.println("maxSize : " + d.getMaxSize());
		System.out.println("cardinal : " + d.getCardinal());
		System.out.println("nbListes : " + d.getNbListes());
		int nbRecherches = 100000;
		long deb = System.currentTimeMillis();
		for(int i = 0; i < nbRecherches; i++) {
			tailleMot = random.nextInt(15) + 2; //2 <= tailleMot <= 16
			mot = new char[tailleMot];
			for(int j = 0; j < mot.length; j++) {
				mot[j] = (char)('a' + random.nextInt(26));
			}
			motS = new String(mot);
			d.contient(motS);//on ne récupère même pas le résultat de la recherche!
		}
		long fin = System.currentTimeMillis();
		System.out.println("temps total : " + (fin-debut));
	}
}
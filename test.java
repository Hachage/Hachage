import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public int lectureMotsTexte() {
	String filename = "fichier.txt";
	//on suppose que fichier.txt est un fichier dans le meme dossier
	//que les .java
	File f = new File(fileName);
	ListeBigI res = new ListeBigI();
	Scanner sc;
	//un scanner est un objet permettant de "scanner" (parcourir)
	//une entrée (clavier, ou une chaîne, ou un File, etc)
	try {
		sc = new Scanner(f);
		//ici on construit le scanner avec comme entrée f
		//cette construction peut échouer (si par exemple fichier.txt n’existe pas)
	}
	catch(FileNotFoundException e){
		//si la construction échoue, on passe ici
		System.out.println(("problème d’accès au fichier " + e.getMessage()));
		return 0;
	}
	sc.useDelimiter(" |\\n|,|;|:|\\.|!|\\?|-");
	//on définit les délimiteurs comme le caractère ’\n’, le caractère ’,’ etc...
	//cela définit maintenant la notion de "morceau" comme une suite
	//de caractères entre deux délimiteurs
	int nbmots = 0;
	while (sc.hasNext()) { //sc.hasNext() renvoie vrai ssi
		//il reste encore un morceau à découvrir dans f
		String mot = sc.next(); //sc.next() renvoie le prochain morceau
		nbmots ++;
	}
	return nbmots;
}
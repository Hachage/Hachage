import java.math.BigInteger;

public class HTNaive {

    private ListeBigI[] T;

    public HTNaive(int m) {
        this.T = new ListeBigI[m];
    }

    public HTNaive(ListeBigI l, int m) {
        this(m);
        this.T.ajoutListe(l);
    }

    public HTNaive(ListeBigI l, double f) {
        while(!L.estVide()) {
            this.ajout(L.supprTete());
        }
    }

    public String toString() {
        String str = "";
        for(int i = 0; i < this.T.length; i++) {
            if(i == this.T.length-1) {
                str += "t[" + i + "] : " + this.T[i].toString();
            }
            else {
                str += "t[" + i + "] : " + this.T[i].toString() + "\n";
            }    
        }
        return str;
    }

    public String toStringV2() {
        String str = "";
        for(int i = 0; i < this.T.length; i++) {
            if(!this.T[i].estVide()) {
                if(i == this.T.length-1) {
                    str += "t[" + i + "] : ";
                    for(int j = 0; j < this.T[i].longueur(); j++) {
                        str += "*";
                    }
                }
                else {
                    str += "t[" + i + "] : ";
                    for(int j = 0; j < this.T[i].longueur(); j++) {
                        str += "*";
                    }
                    str += "\n";
                }
            }    
        }
        return str;
    }

    public ListeBigI getliste(int i) {
        return this.T[i];
    }

    public int h(BigInteger u) {
        return u.intValue() % this.T.length;
    }

    public boolean contient(BigInteger u) {
        return this.T[h(u)].contient(u); 
    }

    public boolean ajout(BigInteger u){
        if(!this.contient(u)) {
            this.T[h(u)].ajoutTete(u);
            return true;
        }
        else {
            return false;
        }
    }

    public void ajoutListe(ListeBigI L) {
        while(!L.estVide()) {
            this.ajout(L.supprTete());
        }
    }

    public ListeBigI getElements() {
        ListeBigI L = new ListeBigI();
        for(int i = 0; i < this.T.length; i++) {
            L.ajoutListe(this.T[i]);
        }
        return L;
    }

    public int getNbListes() {
        return this.T.length;
    }

    public int getCardinal() {
        int somme = 0;
        for(int i = 0; i < this.T.length; i++) {
            somme += this.T[i].longueur();
        }
        return somme;
    }

    public int getMaxSize() {
        int max = this.T[0].longueur();
        for(int i = 1; i < this.T.length; i++) {
            if(max < this.T[i].longueur()) {
                max = this.T[i].longueur();
            }
        }
        return max;
    }
}

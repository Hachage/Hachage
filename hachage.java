import java.math.BigInteger;

public class HTNaive {

    private ListeBigI[] T;

    public HTNaive(int m) {
        this.T = new ListeBigI[m];
    }

    public ListeBigI getliste(int i) {
        return this.T[i];
    }

    public int h(BigInteger u) {
        return u.intValue() % this.T.length;
    }

    public boolean contient(BigInteger u) {
        int indice = this.T[h(u)].contient 
    }
}

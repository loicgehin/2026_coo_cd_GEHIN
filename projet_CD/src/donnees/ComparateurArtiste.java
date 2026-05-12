package donnees;

public class ComparateurArtiste implements ComparateurCd {

    public boolean  etreAvant(CD cd1, CD cd2){
        if (cd1.compareArtiste(cd2)>0)
            return true;
        else
            return false;
    }
}

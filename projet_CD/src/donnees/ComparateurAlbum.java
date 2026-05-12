package donnees;

public class ComparateurAlbum implements ComparateurCd {

    public boolean  etreAvant(CD cd1, CD cd2){
        if (cd1.compareTitre(cd2)<0)
            return true;
        else
            return false;
    }

}

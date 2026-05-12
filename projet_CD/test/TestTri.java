import XML.ChargeurMagasin;
import donnees.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

public class TestTri {
    Magasin magasin;
    @BeforeEach
    public void debut() {
        magasin=new Magasin();
        CD cd1=new CD("A Tribe Called Quest", "Midnight Marauders");

        CD cd2=new CD("Metallica", "Master of Puppets");

        CD cd3=new CD("Pink Floyd", "Wish you were here");

        CD cd4=new CD("TH", "E-MUSIC");

        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd2);
        magasin.ajouteCd(cd3);
        magasin.ajouteCd(cd4);

    }

    @Test
    public void testTrierAlbum() {
        //methode testee
        magasin.trier(new ComparateurAlbum());

        CD premier=magasin.getCd(0);
        CD dernier=magasin.getCd(magasin.getNombreCds()-1);

        //verification
        assertEquals("E-MUSIC", premier.getNomCD());
        assertEquals("Wish you were here", dernier.getNomCD());
    }

    @Test
    public void testTrierArtiste() {
        //methode testee
        magasin.trier(new ComparateurArtiste());

        CD premier=magasin.getCd(0);
        CD dernier=magasin.getCd(magasin.getNombreCds()-1);

        //verification
        assertEquals("A Tribe Called Quest", premier.getNomArtiste());
        assertEquals("TH", dernier.getNomArtiste());
    }
}

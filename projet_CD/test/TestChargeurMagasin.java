import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

public class TestChargeurMagasin {
    @Test
    public void repertoireValide() {
        //initialisation
        String repertoire = "musicbrainzSimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);

        //test exception
        Magasin magasin= assertDoesNotThrow(() -> charge.chargerMagasin());

        //test taille
        assertNotNull(magasin, "Le magasin est null");
        assertTrue(magasin.getNombreCds()>1, "Le magasin ne contient pas de CD");
    }

    @Test
    public void repertoireInexistant() {
        //initialisation
        String repertoire = "aaa/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);

        //test exception
        assertThrows(FileNotFoundException.class, () -> charge.chargerMagasin(), "FileNotFound exception doit etre levee");
    }


}

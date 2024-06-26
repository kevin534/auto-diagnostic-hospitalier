import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CabineAutoDiagnosticTest {

    @Test
    void testProblemeCardiaque() {
        String resultat = CabineAutoDiagnostic.diagnostiquer(33);
        System.out.println("Test problème cardiaque (33) : " + resultat);
        assertEquals("Cardiologie", resultat);
    }

    @Test
    void testFracture() {
        String resultat = CabineAutoDiagnostic.diagnostiquer(55);
        System.out.println("Test fracture (55) : " + resultat);
        assertEquals("Traumatologie", resultat);
    }

    @Test
    void testProblemesMultiples() {
        String resultat = CabineAutoDiagnostic.diagnostiquer(15);
        System.out.println("Test problèmes multiples (15) : " + resultat);
        assertEquals("Cardiologie, Traumatologie", resultat);
    }
    /*
    testAucunePathologie vérifie que le système peut correctement identifier et gérer les cas où aucune pathologie n'est détectée
     */

    @Test
    void testAucunePathologie() {
        String resultat = CabineAutoDiagnostic.diagnostiquer(7);
        System.out.println("Test aucune pathologie (7) : " + resultat);
        assertEquals("Aucune pathologie détectée", resultat);
    }

    /*
    Pour un index de 0, le système recommande bien les deux services médicaux (Cardiologie et Traumatologie)
     */

    @Test
    void testIndexZero() {
        String resultat = CabineAutoDiagnostic.diagnostiquer(0);
        System.out.println("Test index zéro (0) : " + resultat);
        assertEquals("Cardiologie, Traumatologie", resultat);
    }
    /*
    Gestion des entrées inattendues ou erronées pour s'assurer que le système ne plante pas
     */
    @Test
    void testIndexNegatif() {
        String resultat = CabineAutoDiagnostic.diagnostiquer(-1);
        System.out.println("Test index négatif (-1) : " + resultat);
        assertEquals("Aucune pathologie détectée", resultat);
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CabineAutoDiagnosticTest {

    @Test
    void testProblemeCardiaque() {
        assertEquals("Cardiologie", CabineAutoDiagnostic.diagnostiquer(33));
    }

    @Test
    void testFracture() {
        assertEquals("Traumatologie", CabineAutoDiagnostic.diagnostiquer(55));
    }

    @Test
    void testProblemesMultiples() {
        assertEquals("Cardiologie, Traumatologie", CabineAutoDiagnostic.diagnostiquer(15));
    }

    @Test
    void testAucunePathologie() {
        assertEquals("Aucune pathologie détectée", CabineAutoDiagnostic.diagnostiquer(7));
    }

    @Test
    void testIndexZero() {
        assertEquals("Cardiologie, Traumatologie", CabineAutoDiagnostic.diagnostiquer(0));
    }

    @Test
    void testIndexNegatif() {
        assertEquals("Aucune pathologie détectée", CabineAutoDiagnostic.diagnostiquer(-1));
    }
}
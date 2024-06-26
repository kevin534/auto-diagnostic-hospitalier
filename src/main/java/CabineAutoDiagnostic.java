import java.util.ArrayList;
import java.util.List;

public class CabineAutoDiagnostic {
    private static final int INDICATEUR_PROBLEME_CARDIAQUE = 3;
    private static final int INDICATEUR_FRACTURE = 5;

    public static String diagnostiquer(int indexSante) {
        List<String> services = new ArrayList<>();

        if (estMultipleDe(indexSante, INDICATEUR_PROBLEME_CARDIAQUE)) {
            services.add("Cardiologie");
        }

        if (estMultipleDe(indexSante, INDICATEUR_FRACTURE)) {
            services.add("Traumatologie");
        }

        if (services.isEmpty()) {
            return "Aucune pathologie détectée";
        }

        /*
       Concatenation des services.
        */
        return String.join(", ", services);
    }

    private static boolean estMultipleDe(int nombre, int diviseur) {
        return nombre % diviseur == 0;
    }
}

import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (abbreviation == null || explanation == null) {
            return;
        }

        String abbre = sanitizedString(abbreviation);
        String expla = sanitizedString(explanation);

        abbreviations.put(abbre, expla);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviation == null) {
            return false;
        }

        if (abbreviations.containsKey(sanitizedString(abbreviation))) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        String abbreviationSanitized = sanitizedString(abbreviation);
        if (abbreviation == null || !abbreviations.containsKey(abbreviationSanitized)) {
            return null;
        }
        return abbreviations.get(abbreviationSanitized);
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }

}

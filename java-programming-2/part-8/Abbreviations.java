import java.util.HashMap;

/**
 * public void addAbbreviation(String abbreviation, String explanation) adds a
 * new abbreviation and its explanation.
 * public boolean hasAbbreviation(String abbreviation) checks if an abbreviation
 * has already been added; returns true if it has and false if it has not.
 * public String findExplanationFor(String abbreviation) finds the explanation
 * for an abbreviation; returns null if the abbreviation has not been added yet.
 */

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbr, String explanation) {
        this.abbreviations.put(abbr, explanation);
    }

    public boolean hasAbbreviation(String abbr) {
        return abbreviations.containsKey(abbr);
    }

    public String findExplanationFor(String abbr) {
        return abbreviations.get(abbr);
    }
}

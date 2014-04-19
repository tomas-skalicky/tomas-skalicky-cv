package com.skalicky.tomas.cv.domain;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public enum Language {

    ENGLISH("english", "en"), GERMAN("german", "de"), CZECH("czech", "cz"), FRENCH("french", "fr");

    private static final String LOCALIZATION_KEY_PREFIX = "language.";

    @NotBlank
    private final String localizationKeySuffix;

    @NotBlank
    private final String abbreviation;

    private Language(String localizationKeySuffix, String abbreviation) {
        this.localizationKeySuffix = localizationKeySuffix;
        this.abbreviation = abbreviation;
    }

    public String getLocalizationKey() {
        return LOCALIZATION_KEY_PREFIX + localizationKeySuffix;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    private static final Map<String, Language> ABBREVIATION_TO_TYPE = initializeAbbretiationToTypeMap();

    private static Map<String, Language> initializeAbbretiationToTypeMap() {
        Map<String, Language> abbreviationTypeMap = new HashMap<>();
        for (Language type : values()) {
            abbreviationTypeMap.put(type.getAbbreviation(), type);
        }
        return abbreviationTypeMap;
    }

    /**
     * Time complexity O(1).
     * 
     * @param abbreviation
     * @return {@link Language} which the {@code abbreviation} correspond to.
     * @throws IllegalArgumentException
     *             if the abbreviation doesn't correspond to any {@link Language}
     */
    public static Language getType(String abbreviation) {
        if (ABBREVIATION_TO_TYPE.containsKey(abbreviation)) {
            return ABBREVIATION_TO_TYPE.get(abbreviation);
        } else {
            throw new IllegalArgumentException("The abbreviation '" + abbreviation
                    + "' doesn't correspond to any supported language");
        }
    }
}

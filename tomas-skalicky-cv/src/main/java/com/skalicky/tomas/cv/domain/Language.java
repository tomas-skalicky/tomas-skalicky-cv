package com.skalicky.tomas.cv.domain;

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
}

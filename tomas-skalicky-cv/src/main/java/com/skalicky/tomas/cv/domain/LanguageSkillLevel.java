package com.skalicky.tomas.cv.domain;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public enum LanguageSkillLevel {

    MOTHER_TONGUE("motherTongue"), ADVANCED("advanced"), BASICS("basics");

    private static final String LOCALIZATION_KEY_PREFIX = "language.skillLevel.";

    @NotBlank
    private final String localizationKeySuffix;

    private LanguageSkillLevel(String localizationKeySuffix) {
        this.localizationKeySuffix = localizationKeySuffix;
    }

    public String getLocalizationKey() {
        return LOCALIZATION_KEY_PREFIX + localizationKeySuffix;
    }
}

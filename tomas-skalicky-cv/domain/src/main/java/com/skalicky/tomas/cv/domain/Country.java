package com.skalicky.tomas.cv.domain;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public enum Country {

    GERMANY("germany", "+49"), CZECH_REPUBLIC("czechRepublic", "+420");

    private static final String LOCALIZATION_KEY_PREFIX = "country.";

    @NotBlank
    private final String localizationKeySuffix;

    @NotBlank
    private final String areaCode;

    private Country(String localizationKeySuffix, String areaCode) {
        this.localizationKeySuffix = localizationKeySuffix;
        this.areaCode = areaCode;
    }

    public String getLocalizationKey() {
        return LOCALIZATION_KEY_PREFIX + localizationKeySuffix;
    }

    public String getAreaCode() {
        return areaCode;
    }
}

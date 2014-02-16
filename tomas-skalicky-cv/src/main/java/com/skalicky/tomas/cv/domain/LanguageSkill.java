package com.skalicky.tomas.cv.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.skalicky.tomas.cv.validation.Postconditions;
import com.skalicky.tomas.cv.validation.ValidatorFactory;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class LanguageSkill {

    @NotNull
    @Valid
    private Language language;

    @NotNull
    @Valid
    private LanguageSkillLevel level;

    private String notes;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public LanguageSkill() {
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public LanguageSkillLevel getLevel() {
        return level;
    }

    public void setLevel(LanguageSkillLevel level) {
        this.level = level;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("LanguageSkill [");
        builder.append(language);
        builder.append(", ");
        builder.append(level);
        builder.append(", ");
        builder.append(notes);
        builder.append("]");
        return builder.toString();
    }

    private LanguageSkill(Builder builder) {
        language = builder.language;
        level = builder.level;
        notes = builder.notes;
    }

    public static class Builder {

        private Language language;
        private LanguageSkillLevel level;
        private String notes;

        public Builder withLanguage(Language language) {
            this.language = language;
            return this;
        }

        public Builder withLevel(LanguageSkillLevel level) {
            this.level = level;
            return this;
        }

        public Builder withNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public LanguageSkill build() {
            LanguageSkill newSkill = new LanguageSkill(this);
            Postconditions.isValid(newSkill, ValidatorFactory.getValidator());
            return newSkill;
        }
    }
}

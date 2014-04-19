package com.skalicky.tomas.cv.domain;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class Competency {

    @NotBlank
    private String knowledge;

    @NotNull
    @Digits(integer = 2, fraction = 1)
    private BigDecimal experienceInYears;

    @NotNull
    @Valid
    private CompetencyLevel level;

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public BigDecimal getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(BigDecimal experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public CompetencyLevel getLevel() {
        return level;
    }

    public void setLevel(CompetencyLevel level) {
        this.level = level;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Competency [");
        builder.append(knowledge);
        builder.append(", ");
        builder.append(experienceInYears);
        builder.append(", ");
        builder.append(level);
        builder.append("]");
        return builder.toString();
    }
}

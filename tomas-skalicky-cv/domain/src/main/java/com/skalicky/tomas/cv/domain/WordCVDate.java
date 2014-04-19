package com.skalicky.tomas.cv.domain;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeName;

import com.skalicky.tomas.cv.util.validation.Postconditions;
import com.skalicky.tomas.cv.util.validation.ValidatorFactory;

/**
 * Represents a "present" point of time.
 *
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
@JsonTypeName(WordCVDate.JSON_TYPE_NAME)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
public class WordCVDate extends AbstractCVDate {

    static final String JSON_TYPE_NAME = "WORD_CV_DATE";

    @NotNull
    private Boolean isPresent;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public WordCVDate() {
    }

    @Override
    public Boolean getIsPresent() {
        return isPresent;
    }

    @Override
    public void setIsPresent(Boolean isPresent) {
        this.isPresent = isPresent;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("WorkCVDate [");
        builder.append(isPresent);
        builder.append("]");
        return builder.toString();
    }

    private WordCVDate(Builder builder) {
        isPresent = builder.isPresent;
    }

    public static class Builder {

        private Boolean isPresent;

        public Builder withIsPresent(Boolean isPresent) {
            this.isPresent = isPresent;
            return this;
        }

        public WordCVDate build() {
            WordCVDate newDate = new WordCVDate(this);
            Postconditions.isValid(newDate, ValidatorFactory.getValidator());
            return newDate;
        }
    }
}

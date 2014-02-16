package com.skalicky.tomas.cv.domain;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.joda.time.DateTime;

import com.skalicky.tomas.cv.validation.Postconditions;
import com.skalicky.tomas.cv.validation.ValidatorFactory;

/**
 * Represents a numeric date, e.g. 06/2013
 * 
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
@JsonTypeName(NumericCVDate.JSON_TYPE_NAME)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
public class NumericCVDate extends AbstractCVDate {

    static final String JSON_TYPE_NAME = "NUMERIC_CV_DATE";

    @NotNull
    private DateTime date;

    @NotNull
    private Boolean showDay;

    @NotNull
    private Boolean showMonth;

    @NotNull
    private Boolean showYear;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public NumericCVDate() {
    }

    @Override
    public DateTime getDate() {
        return date;
    }

    @Override
    public void setDate(DateTime date) {
        this.date = date;
    }

    @Override
    public Boolean getShowDay() {
        return showDay;
    }

    @Override
    public void setShowDay(Boolean showDay) {
        this.showDay = showDay;
    }

    @Override
    public Boolean getShowMonth() {
        return showMonth;
    }

    @Override
    public void setShowMonth(Boolean showMonth) {
        this.showMonth = showMonth;
    }

    @Override
    public Boolean getShowYear() {
        return showYear;
    }

    @Override
    public void setShowYear(Boolean showYear) {
        this.showYear = showYear;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NumericCVDate [");
        builder.append(date);
        builder.append(", ");
        builder.append(showDay);
        builder.append(", ");
        builder.append(showMonth);
        builder.append(", ");
        builder.append(showYear);
        builder.append("]");
        return builder.toString();
    }

    private NumericCVDate(Builder builder) {
        date = builder.date;
        showDay = builder.showDay;
        showMonth = builder.showMonth;
        showYear = builder.showYear;
    }

    public static class Builder {

        private DateTime date;
        private Boolean showDay;
        private Boolean showMonth;
        private Boolean showYear;

        public Builder withDate(DateTime date) {
            this.date = date;
            return this;
        }

        public Builder withShowDay(Boolean showDay) {
            this.showDay = showDay;
            return this;
        }

        public Builder withShowMonth(Boolean showMonth) {
            this.showMonth = showMonth;
            return this;
        }

        public Builder withShowYear(Boolean showYear) {
            this.showYear = showYear;
            return this;
        }

        public NumericCVDate build() {
            NumericCVDate newDate = new NumericCVDate(this);
            Postconditions.isValid(newDate, ValidatorFactory.getValidator());
            return newDate;
        }
    }
}

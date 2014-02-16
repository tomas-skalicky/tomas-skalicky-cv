package com.skalicky.tomas.cv.domain;

import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

/**
 * Represents a numeric date, e.g. 06/2013
 * 
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class NumericCVDate extends AbstractCVDate {

    @NotNull
    private DateTime date;

    @NotNull
    private Boolean showDay;

    @NotNull
    private Boolean showMonth;

    @NotNull
    private Boolean showYear;

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
}

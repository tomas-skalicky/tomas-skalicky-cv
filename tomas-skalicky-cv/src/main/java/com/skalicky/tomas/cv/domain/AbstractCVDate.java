package com.skalicky.tomas.cv.domain;

import org.joda.time.DateTime;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public abstract class AbstractCVDate implements CVDate {

    /**
     * Dummy implementation
     */
    @Override
    public DateTime getDate() {
        return null;
    }

    /**
     * Dummy implementation
     */
    @Override
    public void setDate(DateTime date) {
    }

    /**
     * Dummy implementation
     */
    @Override
    public Boolean getShowDay() {
        return null;
    }

    /**
     * Dummy implementation
     */
    @Override
    public void setShowDay(Boolean showDay) {
    }

    /**
     * Dummy implementation
     */
    @Override
    public Boolean getShowMonth() {
        return null;
    }

    /**
     * Dummy implementation
     */
    @Override
    public void setShowMonth(Boolean showMonth) {
    }

    /**
     * Dummy implementation
     */
    @Override
    public Boolean getShowYear() {
        return null;
    }

    /**
     * Dummy implementation
     */
    @Override
    public void setShowYear(Boolean showYear) {
    }

    /**
     * Dummy implementation
     */
    @Override
    public Boolean getIsPresent() {
        return null;
    }

    /**
     * Dummy implementation
     */
    @Override
    public void setIsPresent(Boolean isPresent) {
    }
}

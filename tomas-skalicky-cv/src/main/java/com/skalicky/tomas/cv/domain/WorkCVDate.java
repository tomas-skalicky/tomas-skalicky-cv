package com.skalicky.tomas.cv.domain;

import javax.validation.constraints.NotNull;

/**
 * Represents a "present" point of time.
 * 
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class WorkCVDate extends AbstractCVDate {

    @NotNull
    private Boolean isPresent;

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
}

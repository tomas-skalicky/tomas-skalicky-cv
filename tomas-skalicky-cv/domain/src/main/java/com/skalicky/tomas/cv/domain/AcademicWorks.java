package com.skalicky.tomas.cv.domain;

import javax.validation.Valid;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class AcademicWorks {

    @Valid
    private AcademicWork bachelorThesis;

    @Valid
    private AcademicWork masterThesis;

    public AcademicWork getBachelorThesis() {
        return bachelorThesis;
    }

    public void setBachelorThesis(AcademicWork bachelorThesis) {
        this.bachelorThesis = bachelorThesis;
    }

    public AcademicWork getMasterThesis() {
        return masterThesis;
    }

    public void setMasterThesis(AcademicWork masterThesis) {
        this.masterThesis = masterThesis;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AcademicWorks [");
        builder.append(bachelorThesis);
        builder.append(", ");
        builder.append(masterThesis);
        builder.append("]");
        return builder.toString();
    }
}

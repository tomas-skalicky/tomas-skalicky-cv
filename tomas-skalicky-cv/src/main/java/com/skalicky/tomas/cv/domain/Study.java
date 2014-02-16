package com.skalicky.tomas.cv.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class Study {

    @NotNull
    @Valid
    private AbstractCVDate from;

    @NotNull
    @Valid
    private AbstractCVDate to;

    @NotBlank
    private String schoolName;

    private String schoolDepartmentName;

    @NotBlank
    private String specialization;

    private String reachedTitle;

    private String studyType;

    public AbstractCVDate getFrom() {
        return from;
    }

    public void setFrom(AbstractCVDate from) {
        this.from = from;
    }

    public AbstractCVDate getTo() {
        return to;
    }

    public void setTo(AbstractCVDate to) {
        this.to = to;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolDepartmentName() {
        return schoolDepartmentName;
    }

    public void setSchoolDepartmentName(String schoolDepartmentName) {
        this.schoolDepartmentName = schoolDepartmentName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getReachedTitle() {
        return reachedTitle;
    }

    public void setReachedTitle(String reachedTitle) {
        this.reachedTitle = reachedTitle;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Study [");
        builder.append(from);
        builder.append(", ");
        builder.append(to);
        builder.append(", ");
        builder.append(schoolName);
        builder.append(", ");
        builder.append(schoolDepartmentName);
        builder.append(", ");
        builder.append(specialization);
        builder.append(", ");
        builder.append(reachedTitle);
        builder.append(", ");
        builder.append(studyType);
        builder.append("]");
        return builder.toString();
    }
}

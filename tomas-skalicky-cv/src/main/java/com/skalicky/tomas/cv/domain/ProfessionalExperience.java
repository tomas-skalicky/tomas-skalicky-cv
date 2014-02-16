package com.skalicky.tomas.cv.domain;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class ProfessionalExperience {

    @NotNull
    @Valid
    private AbstractCVDate from;

    @NotNull
    @Valid
    private AbstractCVDate to;

    private String projectName;

    @NotBlank
    private String position;

    private String employer;

    private String customer;

    private String projectDescription;

    @NotBlank
    private String responsibilities;

    private List<String> usedTechnologies;

    private String notes;

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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public List<String> getUsedTechnologies() {
        return usedTechnologies;
    }

    public void setUsedTechnologies(List<String> usedTechnologies) {
        this.usedTechnologies = usedTechnologies;
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
        builder.append("ProfessionalExperience [");
        builder.append(from);
        builder.append(", ");
        builder.append(to);
        builder.append(", ");
        builder.append(projectName);
        builder.append(", ");
        builder.append(position);
        builder.append(", ");
        builder.append(employer);
        builder.append(", ");
        builder.append(customer);
        builder.append(", ");
        builder.append(projectDescription);
        builder.append(", ");
        builder.append(responsibilities);
        builder.append(", ");
        builder.append(usedTechnologies);
        builder.append(", ");
        builder.append(notes);
        builder.append("]");
        return builder.toString();
    }
}

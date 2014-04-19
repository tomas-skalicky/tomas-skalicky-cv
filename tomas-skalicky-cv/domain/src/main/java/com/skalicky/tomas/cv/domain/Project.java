package com.skalicky.tomas.cv.domain;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.skalicky.tomas.cv.util.validation.Postconditions;
import com.skalicky.tomas.cv.util.validation.ValidatorFactory;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class Project {

    @NotBlank
    private String projectName;

    private String projectDescription;

    @NotNull
    @Valid
    private CVDate from;

    @NotNull
    @Valid
    private CVDate to;

    private String notes;

    @NotBlank
    private String responsibilities;

    private List<String> usedTechnologies;

    private String customer;

    /**
     * Default constructor
     */
    public Project() {
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public CVDate getFrom() {
        return from;
    }

    public void setFrom(CVDate from) {
        this.from = from;
    }

    public CVDate getTo() {
        return to;
    }

    public void setTo(CVDate to) {
        this.to = to;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    private Project(Builder builder) {
        projectName = builder.projectName;
        projectDescription = builder.projectDescription;
        from = builder.from;
        to = builder.to;
        notes = builder.notes;
        responsibilities = builder.responsibilities;
        usedTechnologies = builder.usedTechnologies;
        customer = builder.customer;
    }

    public static class Builder {

        private String projectName;
        private String projectDescription;
        private CVDate from;
        private CVDate to;
        private String notes;
        private String responsibilities;
        private List<String> usedTechnologies;
        private String customer;

        public Builder withProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        public Builder withProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }

        public Builder withFrom(CVDate from) {
            this.from = from;
            return this;
        }

        public Builder withTo(CVDate to) {
            this.to = to;
            return this;
        }

        public Builder withNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder withResponsibilities(String responsibilities) {
            this.responsibilities = responsibilities;
            return this;
        }

        public Builder withUsedTechnologies(List<String> usedTechnologies) {
            this.usedTechnologies = usedTechnologies;
            return this;
        }

        public Builder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public Project build() {
            Project newProject = new Project(this);
            Postconditions.isValid(newProject, ValidatorFactory.getValidator());
            return newProject;
        }
    }
}

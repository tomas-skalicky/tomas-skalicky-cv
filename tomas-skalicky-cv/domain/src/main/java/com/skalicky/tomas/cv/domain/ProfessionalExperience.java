package com.skalicky.tomas.cv.domain;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class ProfessionalExperience {

    @NotBlank
    private String position;

    @NotBlank
    private String employer;

    @NotNull
    @Valid
    private CVDate from;

    @NotNull
    @Valid
    private CVDate to;

    @NotEmpty
    private List<Project> projects;

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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProfessionalExperience [position=");
        builder.append(position);
        builder.append(", employer=");
        builder.append(employer);
        builder.append(", from=");
        builder.append(from);
        builder.append(", to=");
        builder.append(to);
        builder.append(", projects=");
        builder.append(projects);
        builder.append("]");
        return builder.toString();
    }
}

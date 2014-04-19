package com.skalicky.tomas.cv.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.skalicky.tomas.cv.util.validation.Postconditions;
import com.skalicky.tomas.cv.util.validation.ValidatorFactory;

/**
 * Curriculum Vitae
 *
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class CV {

    @NotNull
    @Valid
    private Person person;

    @NotNull
    @Valid
    private Language localization;

    @NotNull
    @Valid
    private CVSummary summary;

    @NotNull
    @Valid
    private List<ProfessionalExperience> professionalExperience;

    @NotNull
    @Valid
    private List<Project> projects;

    @NotNull
    @Valid
    private List<Competency> competencies;

    @NotNull
    @Valid
    private List<Study> studies;

    @NotEmpty
    @Valid
    private List<LanguageSkill> languageSkills;

    @NotNull
    private Map<String, List<String>> otherSkillsAndKnowledge;

    @NotNull
    private List<String> interests;

    private AcademicWorks academicWorks;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public CV() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Language getLocalization() {
        return localization;
    }

    public void setLocalization(Language localization) {
        this.localization = localization;
    }

    public CVSummary getSummary() {
        return summary;
    }

    public void setSummary(CVSummary summary) {
        this.summary = summary;
    }

    public List<ProfessionalExperience> getProfessionalExperience() {
        return professionalExperience;
    }

    public void setProfessionalExperience(List<ProfessionalExperience> professionalExperience) {
        this.professionalExperience = professionalExperience;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Competency> getCompetencies() {
        return competencies;
    }

    public void setCompetencies(List<Competency> competencies) {
        this.competencies = competencies;
    }

    public List<Study> getStudies() {
        return studies;
    }

    public void setStudies(List<Study> studies) {
        this.studies = studies;
    }

    public List<LanguageSkill> getLanguageSkills() {
        return languageSkills;
    }

    public void setLanguageSkills(List<LanguageSkill> languageSkills) {
        this.languageSkills = languageSkills;
    }

    public Map<String, List<String>> getOtherSkillsAndKnowledge() {
        return otherSkillsAndKnowledge;
    }

    public void setOtherSkillsAndKnowledge(Map<String, List<String>> otherSkillsAndKnowledge) {
        this.otherSkillsAndKnowledge = otherSkillsAndKnowledge;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public AcademicWorks getAcademicWorks() {
        return academicWorks;
    }

    public void setAcademicWorks(AcademicWorks academicWorks) {
        this.academicWorks = academicWorks;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CV [");
        builder.append(person);
        builder.append(", ");
        builder.append(localization);
        builder.append(", ");
        builder.append(summary);
        builder.append(", ");
        builder.append(professionalExperience);
        builder.append(", ");
        builder.append(projects);
        builder.append(", ");
        builder.append(competencies);
        builder.append(", ");
        builder.append(studies);
        builder.append(", ");
        builder.append(languageSkills);
        builder.append(", ");
        builder.append(otherSkillsAndKnowledge);
        builder.append(", ");
        builder.append(interests);
        builder.append("]");
        return builder.toString();
    }

    private CV(Builder builder) {
        person = builder.person;
        localization = builder.localization;
        summary = builder.summary;
        professionalExperience = builder.professionalExperience;
        projects = builder.projects;
        competencies = builder.competencies;
        studies = builder.studies;
        languageSkills = builder.languageSkills;
        otherSkillsAndKnowledge = builder.otherSkillsAndKnowledge;
        interests = builder.interests;
        academicWorks = builder.academicWorks;
    }

    public static class Builder {

        private Person person;
        private Language localization;
        private CVSummary summary;
        private List<ProfessionalExperience> professionalExperience = new ArrayList<>();
        private List<Project> projects;
        private List<Competency> competencies = new ArrayList<>();
        private List<Study> studies = new ArrayList<>();
        private List<LanguageSkill> languageSkills = new ArrayList<>();
        private Map<String, List<String>> otherSkillsAndKnowledge = new HashMap<>();
        private List<String> interests = new ArrayList<>();
        private AcademicWorks academicWorks;

        public Builder withPerson(Person person) {
            this.person = person;
            return this;
        }

        public Builder withLocalization(Language localization) {
            this.localization = localization;
            return this;
        }

        public Builder withSummary(CVSummary summary) {
            this.summary = summary;
            return this;
        }

        public Builder withProfessionalExperience(List<ProfessionalExperience> professionalExperience) {
            this.professionalExperience = professionalExperience;
            return this;
        }

        public Builder withProjects(List<Project> projects) {
            this.projects = projects;
            return this;
        }

        public Builder withCompetencies(List<Competency> competencies) {
            this.competencies = competencies;
            return this;
        }

        public Builder withStudies(List<Study> studies) {
            this.studies = studies;
            return this;
        }

        public Builder withLanguageSkills(List<LanguageSkill> languageSkills) {
            this.languageSkills = languageSkills;
            return this;
        }

        public Builder withOtherSkillsAndKnowledge(Map<String, List<String>> otherSkillsAndKnowledge) {
            this.otherSkillsAndKnowledge = otherSkillsAndKnowledge;
            return this;
        }

        public Builder withInterests(List<String> interests) {
            this.interests = interests;
            return this;
        }

        public Builder withAcademicWorks(AcademicWorks academicWorks) {
            this.academicWorks = academicWorks;
            return this;
        }

        public CV build() {
            CV newCV = new CV(this);
            Postconditions.isValid(newCV, ValidatorFactory.getValidator());
            return newCV;
        }
    }
}

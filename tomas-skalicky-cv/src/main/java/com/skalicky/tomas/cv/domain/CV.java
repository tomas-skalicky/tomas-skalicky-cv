package com.skalicky.tomas.cv.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.skalicky.tomas.cv.validation.Postconditions;
import com.skalicky.tomas.cv.validation.ValidatorFactory;

/**
 * Curriculum Vitae
 * 
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
@Document(collection = "cv")
public class CV {

    @Id
    private String id;

    @NotNull
    @Valid
    private Person person;

    @NotNull
    @Valid
    private Language localization;

    private String summary;

    @NotNull
    @Valid
    private List<ProfessionalExperience> professionalExperience;

    @NotNull
    @Valid
    private AcademicWorks academicWorks;

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

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public CV() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<ProfessionalExperience> getProfessionalExperience() {
        return professionalExperience;
    }

    public void setProfessionalExperience(List<ProfessionalExperience> professionalExperience) {
        this.professionalExperience = professionalExperience;
    }

    public AcademicWorks getAcademicWorks() {
        return academicWorks;
    }

    public void setAcademicWorks(AcademicWorks academicWorks) {
        this.academicWorks = academicWorks;
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

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CV [");
        builder.append(id);
        builder.append(", ");
        builder.append(person);
        builder.append(", ");
        builder.append(localization);
        builder.append(", ");
        builder.append(summary);
        builder.append(", ");
        builder.append(professionalExperience);
        builder.append(", ");
        builder.append(academicWorks);
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
        id = builder.id;
        person = builder.person;
        localization = builder.localization;
        summary = builder.summary;
        professionalExperience = builder.professionalExperience;
        academicWorks = builder.academicWorks;
        competencies = builder.competencies;
        studies = builder.studies;
        languageSkills = builder.languageSkills;
        otherSkillsAndKnowledge = builder.otherSkillsAndKnowledge;
        interests = builder.interests;
    }

    public static class Builder {

        private String id;
        private Person person;
        private Language localization;
        private String summary;
        private List<ProfessionalExperience> professionalExperience = new ArrayList<>();
        private AcademicWorks academicWorks = new AcademicWorks();
        private List<Competency> competencies = new ArrayList<>();
        private List<Study> studies = new ArrayList<>();
        private List<LanguageSkill> languageSkills = new ArrayList<>();
        private Map<String, List<String>> otherSkillsAndKnowledge = new HashMap<>();
        private List<String> interests = new ArrayList<>();

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withPerson(Person person) {
            this.person = person;
            return this;
        }

        public Builder withLocalization(Language localization) {
            this.localization = localization;
            return this;
        }

        public Builder withSummary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder withProfessionalExperience(List<ProfessionalExperience> professionalExperience) {
            this.professionalExperience = professionalExperience;
            return this;
        }

        public Builder withAcademicWorks(AcademicWorks academicWorks) {
            this.academicWorks = academicWorks;
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

        public CV build() {
            CV newCV = new CV(this);
            Postconditions.isValid(newCV, ValidatorFactory.getValidator());
            return newCV;
        }
    }
}

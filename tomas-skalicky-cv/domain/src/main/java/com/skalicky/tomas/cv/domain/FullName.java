package com.skalicky.tomas.cv.domain;

import org.hibernate.validator.constraints.NotBlank;

import com.skalicky.tomas.cv.util.validation.Postconditions;
import com.skalicky.tomas.cv.util.validation.ValidatorFactory;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class FullName {

    private String prefix;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public FullName() {
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder2 = new StringBuilder();
        builder2.append("FullName [");
        builder2.append(prefix);
        builder2.append(", ");
        builder2.append(firstName);
        builder2.append(", ");
        builder2.append(lastName);
        builder2.append("]");
        return builder2.toString();
    }

    private FullName(Builder builder) {
        prefix = builder.prefix;
        firstName = builder.firstName;
        lastName = builder.lastName;
    }

    public static class Builder {

        private String prefix;
        private String firstName;
        private String lastName;

        public Builder withPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public FullName build() {
            FullName newName = new FullName(this);
            Postconditions.isValid(newName, ValidatorFactory.getValidator());
            return newName;
        }
    }
}

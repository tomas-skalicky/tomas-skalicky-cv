package com.skalicky.tomas.cv.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.skalicky.tomas.cv.validation.Postconditions;
import com.skalicky.tomas.cv.validation.ValidatorFactory;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class EmailAddress {

    @NotBlank
    @Email
    private String emailAddress;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public EmailAddress() {
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EmailAddress [");
        builder.append(emailAddress);
        builder.append("]");
        return builder.toString();
    }

    private EmailAddress(Builder builder) {
        emailAddress = builder.emailAddress;
    }

    public static class Builder {

        private String emailAddress;

        public Builder withEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public EmailAddress build() {
            EmailAddress newAddress = new EmailAddress(this);
            Postconditions.isValid(newAddress, ValidatorFactory.getValidator());
            return newAddress;
        }
    }
}

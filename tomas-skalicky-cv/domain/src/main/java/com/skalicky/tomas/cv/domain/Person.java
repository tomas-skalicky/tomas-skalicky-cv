package com.skalicky.tomas.cv.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.skalicky.tomas.cv.util.JsonLocalDateDeserializer;
import com.skalicky.tomas.cv.util.validation.Postconditions;
import com.skalicky.tomas.cv.util.validation.ValidatorFactory;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class Person {

    @NotNull
    @Valid
    private FullName fullName;

    @NotNull
    @Valid
    private Address address;

    @NotNull
    @Valid
    private PhoneNumber cellphone;

    @NotNull
    @Valid
    private EmailAddress emailAddress;

    @NotNull
    @JsonDeserialize(using = JsonLocalDateDeserializer.class)
    private LocalDate birthday;

    @NotNull
    @Valid
    private List<WebSite> personalWebSites;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public Person() {
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getCellphone() {
        return cellphone;
    }

    public void setCellphone(PhoneNumber cellphone) {
        this.cellphone = cellphone;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<WebSite> getPersonalWebSites() {
        return personalWebSites;
    }

    public void setPersonalWebSites(List<WebSite> personalWebSites) {
        this.personalWebSites = personalWebSites;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder2 = new StringBuilder();
        builder2.append("Person [");
        builder2.append(fullName);
        builder2.append(", ");
        builder2.append(address);
        builder2.append(", ");
        builder2.append(cellphone);
        builder2.append(", ");
        builder2.append(emailAddress);
        builder2.append(", ");
        builder2.append(birthday);
        builder2.append(", ");
        builder2.append(personalWebSites);
        builder2.append("]");
        return builder2.toString();
    }

    private Person(Builder builder) {
        fullName = builder.fullName;
        address = builder.address;
        cellphone = builder.cellphone;
        emailAddress = builder.emailAddress;
        birthday = builder.birthday;
        personalWebSites = builder.personalWebSites;
    }

    public static class Builder {

        private FullName fullName;
        private Address address;
        private PhoneNumber cellphone;
        private EmailAddress emailAddress;
        private LocalDate birthday;
        private List<WebSite> personalWebSites = new ArrayList<>();

        public Builder withFullName(FullName fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder withCellphone(PhoneNumber cellphone) {
            this.cellphone = cellphone;
            return this;
        }

        public Builder withEmailAddress(EmailAddress emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder withBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder withPersonalWebSites(List<WebSite> personalWebSites) {
            this.personalWebSites = personalWebSites;
            return this;
        }

        public Person build() {
            Person newPerson = new Person(this);
            Postconditions.isValid(newPerson, ValidatorFactory.getValidator());
            return newPerson;
        }
    }
}

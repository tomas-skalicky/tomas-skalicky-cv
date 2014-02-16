package com.skalicky.tomas.cv.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.skalicky.tomas.cv.validation.Postconditions;
import com.skalicky.tomas.cv.validation.ValidatorFactory;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class Address {

    @NotBlank
    private String street;

    @NotNull
    private Integer streetNumber;

    @NotBlank
    private String city;

    @Valid
    private Country country;

    @NotNull
    @Valid
    private PostCode postCode;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public PostCode getPostCode() {
        return postCode;
    }

    public void setPostCode(PostCode postCode) {
        this.postCode = postCode;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Address [");
        builder.append(street);
        builder.append(", ");
        builder.append(streetNumber);
        builder.append(", ");
        builder.append(city);
        builder.append(", ");
        builder.append(country);
        builder.append(", ");
        builder.append(postCode);
        builder.append("]");
        return builder.toString();
    }

    private Address(Builder builder) {
        street = builder.street;
        streetNumber = builder.streetNumber;
        city = builder.city;
        country = builder.country;
        postCode = builder.postCode;
    }

    public static class Builder {

        private String street;
        private Integer streetNumber;
        private String city;
        private Country country;
        private PostCode postCode;

        public Builder withStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder withStreetNumber(Integer streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withCountry(Country country) {
            this.country = country;
            return this;
        }

        public Builder withPostCode(PostCode postCode) {
            this.postCode = postCode;
            return this;
        }

        public Address build() {
            Address newAddress = new Address(this);
            Postconditions.isValid(newAddress, ValidatorFactory.getValidator());
            return newAddress;
        }
    }
}

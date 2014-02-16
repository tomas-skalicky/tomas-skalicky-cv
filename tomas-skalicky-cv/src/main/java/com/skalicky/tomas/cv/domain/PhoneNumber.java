package com.skalicky.tomas.cv.domain;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.skalicky.tomas.cv.validation.Postconditions;
import com.skalicky.tomas.cv.validation.ValidatorFactory;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class PhoneNumber {

    @NotNull
    @Valid
    private Country country;

    /**
     * Number without both international and local area code.
     * <p>
     * Germany example:
     * <ul>
     * <li>International area code: <b>+49</b></li>
     * <li>Local area code: <b>0</b></li>
     * </ul>
     */
    @NotNull
    @Min(1)
    private Long numberWithoutAreaCode;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public PhoneNumber() {
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * see {@link PhoneNumber#numberWithoutAreaCode}
     */
    public Long getNumberWithoutAreaCode() {
        return numberWithoutAreaCode;
    }

    /**
     * see {@link PhoneNumber#numberWithoutAreaCode}
     */
    public void setNumberWithoutAreaCode(Long numberWithoutAreaCode) {
        this.numberWithoutAreaCode = numberWithoutAreaCode;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PhoneNumber [");
        builder.append(country);
        builder.append(", ");
        builder.append(numberWithoutAreaCode);
        builder.append("]");
        return builder.toString();
    }

    private PhoneNumber(Builder builder) {
        country = builder.country;
        numberWithoutAreaCode = builder.numberWithoutAreaCode;
    }

    public static class Builder {

        private Country country;
        private Long numberWithoutAreaCode;

        public Builder withCountry(Country country) {
            this.country = country;
            return this;
        }

        /**
         * see {@link PhoneNumber#numberWithoutAreaCode}
         */
        public Builder withNumberWithoutAreaCode(Long numberWithoutAreaCode) {
            this.numberWithoutAreaCode = numberWithoutAreaCode;
            return this;
        }

        public PhoneNumber build() {
            PhoneNumber newNumber = new PhoneNumber(this);
            Postconditions.isValid(newNumber, ValidatorFactory.getValidator());
            return newNumber;
        }
    }
}

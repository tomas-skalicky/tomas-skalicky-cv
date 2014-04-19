package com.skalicky.tomas.cv.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.skalicky.tomas.cv.util.validation.Postconditions;
import com.skalicky.tomas.cv.util.validation.ValidatorFactory;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class PostCode {

    @NotNull
    @Min(10000)
    @Max(99999)
    private Integer postCode;

    /**
     * Default constructor is necessary because of existing of the private "Builder" constructor.
     */
    public PostCode() {
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PostCode [");
        builder.append(postCode);
        builder.append("]");
        return builder.toString();
    }

    private PostCode(Builder builder) {
        postCode = builder.postCode;
    }

    public static class Builder {

        private Integer postCode;

        public Builder withPostCode(Integer postCode) {
            this.postCode = postCode;
            return this;
        }

        public PostCode build() {
            PostCode newCode = new PostCode(this);
            Postconditions.isValid(newCode, ValidatorFactory.getValidator());
            return newCode;
        }
    }
}

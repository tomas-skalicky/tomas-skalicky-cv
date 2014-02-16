package com.skalicky.tomas.cv.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.skalicky.tomas.cv.domain.EmailAddress;
import com.skalicky.tomas.cv.domain.FullName;
import com.skalicky.tomas.cv.domain.Person;

public class PostconditionsTest {

    @Test
    public void testIsValid() throws Exception {
        try {
            // Calls the tested method.
            new Person.Builder().withFullName(getFullNameMock()).withEmailAddress(getEmailAddressMock())
                    .build();
        } catch (IllegalArgumentException ex) {

            // Checks the result.
            String missingAddressMessage = "address: \"null\" ... may not be null\n";
            assertTrue("Address is missing", ex.getMessage().contains(missingAddressMessage));
            String errorMessageRest = ex.getMessage().replaceFirst(missingAddressMessage, StringUtils.EMPTY);

            String missingBirthdayMessage = "birthday: \"null\" ... may not be null\n";
            assertTrue("Birthday is missing", errorMessageRest.contains(missingBirthdayMessage));
            errorMessageRest = errorMessageRest.replaceFirst(missingBirthdayMessage, StringUtils.EMPTY);

            String missingCellphoneMessage = "cellphone: \"null\" ... may not be null\n";
            assertEquals("Cellphone is missing", missingCellphoneMessage, errorMessageRest);
        }
    }

    private FullName getFullNameMock() {
        return new FullName.Builder().withPrefix("Mgr.").withFirstName("Tomáš").withLastName("Skalický")
                .build();
    }

    private EmailAddress getEmailAddressMock() {
        return new EmailAddress.Builder().withEmailAddress("skalicky.tomas@gmail.com").build();
    }
}

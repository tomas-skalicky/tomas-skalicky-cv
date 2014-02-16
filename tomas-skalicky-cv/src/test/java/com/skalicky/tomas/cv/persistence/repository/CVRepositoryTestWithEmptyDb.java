package com.skalicky.tomas.cv.persistence.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StringUtils;

import com.skalicky.tomas.cv.domain.Address;
import com.skalicky.tomas.cv.domain.CV;
import com.skalicky.tomas.cv.domain.Country;
import com.skalicky.tomas.cv.domain.EmailAddress;
import com.skalicky.tomas.cv.domain.FullName;
import com.skalicky.tomas.cv.domain.Language;
import com.skalicky.tomas.cv.domain.LanguageSkill;
import com.skalicky.tomas.cv.domain.LanguageSkillLevel;
import com.skalicky.tomas.cv.domain.Person;
import com.skalicky.tomas.cv.domain.PhoneNumber;
import com.skalicky.tomas.cv.domain.PostCode;
import com.skalicky.tomas.cv.persistence.config.SpringMongoConfig;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringMongoConfig.class)
public class CVRepositoryTestWithEmptyDb {

    @Inject
    private CVRepository cvRepository;
    @Inject
    private MongoTemplate mongo;

    @Before
    // @After
    public void dropCollections() {
        mongo.dropCollection(CV.class);
    }

    @Test
    public void testInsert() throws Exception {
        // Calls the tested method.
        CV savedCV = cvRepository.save(getCVMock());

        // Checks the result.
        FullName queryFullName = new FullName.Builder().withPrefix("Mgr.").withFirstName("Tomáš")
                .withLastName("Skalický").build();
        Query searchQuery = query(Criteria.where("person.fullName").is(queryFullName));
        CV foundCV = mongo.findOne(searchQuery, CV.class);
        assertFalse("ID is empty", StringUtils.isEmpty(foundCV.getId()));
        assertEquals("IDs are not same", savedCV.getId(), foundCV.getId());
        assertEquals("Email addresses are not same", "EmailAddress [skalicky.tomas@gmail.com]", foundCV
                .getPerson().getEmailAddress().toString());
    }

    private FullName getFullNameMock() {
        return new FullName.Builder().withPrefix("Mgr.").withFirstName("Tomáš").withLastName("Skalický")
                .build();
    }

    private EmailAddress getEmailAddressMock() {
        return new EmailAddress.Builder().withEmailAddress("skalicky.tomas@gmail.com").build();
    }

    private DateTime getBirthdayMock() {
        return new DateTime(1986, 3, 21, 0, 0);
    }

    private PhoneNumber getCellphoneMock() {
        return new PhoneNumber.Builder().withCountry(Country.GERMANY).withNumberWithoutAreaCode(17638655633L)
                .build();
    }

    private Address getAddressMock() {
        PostCode postCodeMock = new PostCode.Builder().withPostCode(85356).build();
        return new Address.Builder().withStreet("Isarstr.").withStreetNumber(6).withCity("Freising")
                .withPostCode(postCodeMock).build();
    }

    private Person getPersonMock() {
        return new Person.Builder().withFullName(getFullNameMock()).withEmailAddress(getEmailAddressMock())
                .withBirthday(getBirthdayMock()).withCellphone(getCellphoneMock())
                .withAddress(getAddressMock()).build();
    }

    private List<LanguageSkill> getLanguageSkillsMock() {
        List<LanguageSkill> languageSkills = new ArrayList<>();
        languageSkills.add(getCzechLanguageSkillMock());
        languageSkills.add(getGermanLanguageSkillMock());
        return languageSkills;
    }

    private LanguageSkill getCzechLanguageSkillMock() {
        return new LanguageSkill.Builder().withLanguage(Language.CZECH)
                .withLevel(LanguageSkillLevel.MOTHER_TONGUE).build();
    }

    private LanguageSkill getGermanLanguageSkillMock() {
        return new LanguageSkill.Builder().withLanguage(Language.GERMAN)
                .withLevel(LanguageSkillLevel.ADVANCED).withNotes("B2 certificate passed 02/2013").build();
    }

    private CV getCVMock() {
        return new CV.Builder().withPerson(getPersonMock()).withLocalization(Language.ENGLISH)
                .withSummary("I'm a software engineer").withLanguageSkills(getLanguageSkillsMock()).build();
    }
}

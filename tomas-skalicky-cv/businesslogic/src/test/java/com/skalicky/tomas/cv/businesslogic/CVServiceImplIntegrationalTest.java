package com.skalicky.tomas.cv.businesslogic;

import static org.testng.AssertJUnit.assertEquals;

import java.time.Month;

import javax.inject.Inject;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.skalicky.tomas.cv.domain.CV;
import com.skalicky.tomas.cv.domain.CVDate;
import com.skalicky.tomas.cv.domain.Language;
import com.skalicky.tomas.cv.globalconfiguration.SpringContextConfiguration;

@ContextConfiguration(classes = SpringContextConfiguration.class)
public class CVServiceImplIntegrationalTest extends AbstractTestNGSpringContextTests {

    @Inject
    private CVServiceImpl cvService;

    @Test
    public void testGetCV() throws Exception {

        // Calls the tested method.
        CV readCV = cvService.getCV(Language.ENGLISH);

        // Checks the result.
        assertEquals("Email addresses are not same", "skalicky.tomas@gmail.com", readCV.getPerson()
                .getEmailAddress().getEmailAddress());

        CVDate actualFromDateOfLocationInsight = readCV.getProfessionalExperience().get(0).getFrom();
        assertEquals("'From' dates have not same 'year'", 2013, actualFromDateOfLocationInsight.getDate()
                .getYear());
        assertEquals("'From' dates have not same 'month'", Month.MAY, actualFromDateOfLocationInsight
                .getDate().getMonth());
        assertEquals("'From' dates have not same 'isPresent'", null,
                actualFromDateOfLocationInsight.getIsPresent());
        assertEquals("'From' dates have not same 'showDay'", Boolean.FALSE,
                actualFromDateOfLocationInsight.getShowDay());
        assertEquals("'From' dates have not same 'showMonth'", Boolean.TRUE,
                actualFromDateOfLocationInsight.getShowMonth());
        assertEquals("'From' dates have not same 'showYear'", Boolean.TRUE,
                actualFromDateOfLocationInsight.getShowYear());
    }
}

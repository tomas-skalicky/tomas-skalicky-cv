package com.skalicky.tomas.cv.businesslogic;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skalicky.tomas.cv.config.SpringContextConfiguration;
import com.skalicky.tomas.cv.domain.CV;
import com.skalicky.tomas.cv.domain.CVDate;
import com.skalicky.tomas.cv.domain.Language;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextConfiguration.class)
public class CVServiceImplTest {

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
        assertEquals("'From' dates have not same 'month'", 5, actualFromDateOfLocationInsight.getDate()
                .getMonthOfYear());
        assertEquals("'From' dates have not same 'isPresent'", null,
                actualFromDateOfLocationInsight.getIsPresent());
        assertEquals("'From' dates have not same 'showDay'", false,
                actualFromDateOfLocationInsight.getShowDay());
        assertEquals("'From' dates have not same 'showMonth'", true,
                actualFromDateOfLocationInsight.getShowMonth());
        assertEquals("'From' dates have not same 'showYear'", true,
                actualFromDateOfLocationInsight.getShowYear());
    }
}

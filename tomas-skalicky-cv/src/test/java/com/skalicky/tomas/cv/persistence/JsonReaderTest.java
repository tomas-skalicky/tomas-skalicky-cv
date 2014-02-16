package com.skalicky.tomas.cv.persistence;

import static org.junit.Assert.assertEquals;

import java.io.File;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skalicky.tomas.cv.config.SpringContextConfiguration;
import com.skalicky.tomas.cv.domain.CV;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextConfiguration.class)
public class JsonReaderTest {

    @Inject
    private JsonReader jsonReader;

    @Inject
    private ApplicationContext applicationContext;

    @Test
    public void testRead() throws Exception {

        // Prepares the input for the tested method.
        Resource resource = applicationContext.getResource("classpath:data" + File.separator
                + "tomas-skalicky-cv-en.json");

        // Calls the tested method.
        CV readCV = jsonReader.read(resource.getInputStream(), CV.class);

        // Checks the result.
        assertEquals("Email addresses are not same", "skalicky.tomas@gmail.com", readCV.getPerson()
                .getEmailAddress().getEmailAddress());
    }
}

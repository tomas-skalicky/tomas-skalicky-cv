package com.skalicky.tomas.cv.businesslogic;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.skalicky.tomas.cv.domain.CV;
import com.skalicky.tomas.cv.domain.Language;
import com.skalicky.tomas.cv.persistencelayer.JsonReader;
import com.skalicky.tomas.cv.util.JsonUtils;
import com.skalicky.tomas.cv.util.validation.Postconditions;
import com.skalicky.tomas.cv.util.validation.ValidatorFactory;

@Service
public class CVServiceImpl implements CVService {

    private static final String FOLDER_WITH_CVS_RELATIVE_PATH = "data";
    private static final String CV_FILE_NAME_PREFIX = "tomas-skalicky-cv-";

    private final Logger logger = Logger.getLogger(CVServiceImpl.class);

    @Inject
    private JsonReader jsonReader;

    @Inject
    private ApplicationContext applicationContext;

    @Override
    public CV getCV(Language localization) {
        try {
            CV readCV = jsonReader.read(getCVResource(localization), CV.class);
            Postconditions.isValid(readCV, ValidatorFactory.getValidator());
            return readCV;
        } catch (IOException ex) {
            logger.error(ex);
            throw new RuntimeException(ex);
        }
    }

    private InputStream getCVResource(Language localization) throws IOException {
        String jsonResourceString = "classpath:" + FOLDER_WITH_CVS_RELATIVE_PATH + File.separator
                + getCVJsonFileName(localization);
        Resource jsonResource = applicationContext.getResource(jsonResourceString);
        return jsonResource.getInputStream();
    }

    private String getCVJsonFileName(Language localization) {
        return CV_FILE_NAME_PREFIX + localization.getAbbreviation() + "." + JsonUtils.FILE_EXTENSION;
    }
}

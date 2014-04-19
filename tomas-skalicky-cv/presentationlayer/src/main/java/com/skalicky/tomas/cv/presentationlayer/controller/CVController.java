package com.skalicky.tomas.cv.presentationlayer.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skalicky.tomas.cv.businesslogic.CVService;
import com.skalicky.tomas.cv.domain.CV;
import com.skalicky.tomas.cv.domain.Language;

@RestController
@RequestMapping(method = RequestMethod.GET)
public class CVController {

    @Inject
    private CVService cvService;

    @RequestMapping("/")
    public CV index() {
        return cvService.getCV(Language.GERMAN);
    }

    @RequestMapping(value = "/{languageAbbreviation}/")
    public CV localizedIndex(@PathVariable String languageAbbreviation) {
        return cvService.getCV(Language.getType(languageAbbreviation));
    }
}

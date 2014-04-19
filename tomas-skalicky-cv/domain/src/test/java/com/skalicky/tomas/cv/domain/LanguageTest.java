package com.skalicky.tomas.cv.domain;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class LanguageTest {

    @Test
    public void testGetTypeWithEn() throws Exception {
        assertEquals("The returned language is not correct", Language.ENGLISH, Language.getType("en"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetTypeWithNotExistingSk() throws Exception {
        Language.getType("sk");
    }
}

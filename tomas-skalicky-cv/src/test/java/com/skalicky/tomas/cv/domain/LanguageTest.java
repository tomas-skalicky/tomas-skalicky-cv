package com.skalicky.tomas.cv.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LanguageTest {

    @Test
    public void testGetTypeWithEn() throws Exception {
        assertEquals("The returned language is not correct", Language.ENGLISH, Language.getType("en"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTypeWithNotExistingSk() throws Exception {
        Language.getType("sk");
    }
}

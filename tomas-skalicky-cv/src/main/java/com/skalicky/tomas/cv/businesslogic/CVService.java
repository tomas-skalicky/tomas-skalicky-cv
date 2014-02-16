package com.skalicky.tomas.cv.businesslogic;

import com.skalicky.tomas.cv.domain.CV;
import com.skalicky.tomas.cv.domain.Language;

public interface CVService {

    CV getCV(Language localization);
}

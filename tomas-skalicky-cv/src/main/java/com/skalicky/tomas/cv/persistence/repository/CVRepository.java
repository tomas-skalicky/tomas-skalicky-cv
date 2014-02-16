package com.skalicky.tomas.cv.persistence.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.skalicky.tomas.cv.domain.CV;
import com.skalicky.tomas.cv.domain.Language;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public interface CVRepository extends CrudRepository<CV, ObjectId> {

    CV findByLocalization(Language localization);
}

package com.skalicky.tomas.cv.domain;

import java.time.LocalDate;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;
import org.codehaus.jackson.annotate.JsonTypeInfo;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonSubTypes({ @Type(name = NumericCVDate.JSON_TYPE_NAME, value = NumericCVDate.class),
        @Type(name = WordCVDate.JSON_TYPE_NAME, value = WordCVDate.class) })
public interface CVDate {

    LocalDate getDate();

    void setDate(LocalDate date);

    Boolean getShowDay();

    void setShowDay(Boolean showDay);

    Boolean getShowMonth();

    void setShowMonth(Boolean showMonth);

    Boolean getShowYear();

    void setShowYear(Boolean showYear);

    Boolean getIsPresent();

    void setIsPresent(Boolean isPresent);
}

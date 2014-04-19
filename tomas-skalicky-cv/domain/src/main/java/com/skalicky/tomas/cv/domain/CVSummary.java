package com.skalicky.tomas.cv.domain;

import java.util.List;

import javax.validation.constraints.NotNull;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class CVSummary {

    @NotNull
    private List<String> paragraphs;

    public List<String> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CVSummary [");
        builder.append(paragraphs);
        builder.append("]");
        return builder.toString();
    }
}

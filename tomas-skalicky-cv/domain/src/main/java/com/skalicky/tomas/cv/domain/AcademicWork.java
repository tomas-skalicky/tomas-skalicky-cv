package com.skalicky.tomas.cv.domain;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author <a href="mailto:skalicky.tomas@gmail.com">Tomas Skalicky</a>
 */
public class AcademicWork {

    @NotNull
    @Valid
    private CVDate started;

    @NotNull
    @Valid
    private CVDate finished;

    @NotBlank
    private String description;

    @NotNull
    private List<String> usedTechnologies;

    @Valid
    private WebSite webSite;

    public CVDate getStarted() {
        return started;
    }

    public void setStarted(CVDate started) {
        this.started = started;
    }

    public CVDate getFinished() {
        return finished;
    }

    public void setFinished(CVDate finished) {
        this.finished = finished;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getUsedTechnologies() {
        return usedTechnologies;
    }

    public void setUsedTechnologies(List<String> usedTechnologies) {
        this.usedTechnologies = usedTechnologies;
    }

    public WebSite getWebSite() {
        return webSite;
    }

    public void setWebSite(WebSite webSite) {
        this.webSite = webSite;
    }

    /**
     * Generated
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AcademicWork [");
        builder.append(started);
        builder.append(", ");
        builder.append(finished);
        builder.append(", ");
        builder.append(description);
        builder.append(", ");
        builder.append(usedTechnologies);
        builder.append(", ");
        builder.append(webSite);
        builder.append("]");
        return builder.toString();
    }
}

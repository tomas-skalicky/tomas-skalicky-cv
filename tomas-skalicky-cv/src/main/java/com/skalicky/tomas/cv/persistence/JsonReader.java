package com.skalicky.tomas.cv.persistence;

import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class JsonReader {

    private final Logger logger = Logger.getLogger(JsonReader.class);

    /**
     * Reads an instance of the given {@link Class} from the given {@link InputStream}.
     * 
     * @param jsonResource
     *            InputStream where the reader is to read from.
     * @param type
     *            Class of the target object.
     * @return Instance of the {@code type}
     */
    public <T> T read(InputStream jsonResource, Class<T> type) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Reads from the file and converts it to the T class.
            T readObject = mapper.readValue(jsonResource, type);

            logger.debug("Object which has been read: " + readObject);

            return readObject;
        } catch (IOException ex) {
            logger.error(ex);
            throw new RuntimeException(ex);
        }
    }
}

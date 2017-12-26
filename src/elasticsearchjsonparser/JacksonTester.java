package elasticsearchjsonparser;

import java.util.List;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.*;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.type.TypeReference;

public class JacksonTester {

    public static void main(String args[]) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<DataEntry> myObjects = objectMapper.readValue(jsonFile(), new TypeReference<List<DataEntry>>() {});
        String prettyData = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(myObjects);

        System.out.println(prettyData);

    }

    private static File jsonFile() {
        return new File("/home/HQ/kbaik/NetBeansProjects/ElasticsearchJsonParser/src/data/ldc_uyghur_3.json");
    }
}

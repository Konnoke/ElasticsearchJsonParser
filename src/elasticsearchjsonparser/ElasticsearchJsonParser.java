package elasticsearchjsonparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonMappingException;

/**
 *
 * @author KBAI
 */
public class ElasticsearchJsonParser {

    public static void main(String[] args) throws JsonParseException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        File clusterFile = new File("/home/HQ/kbaik/NetBeansProjects/ElasticsearchJsonParser/src/data/LDC_clustering.json");
        File dataFile = new File("/home/HQ/kbaik/NetBeansProjects/ElasticsearchJsonParser/src/data/ldc_uyghur_3.json");
        
        JsonFactory jfactory = new JsonFactory();
        JsonParser jParser = jfactory.createJsonParser(
                new File("/home/HQ/kbaik/NetBeansProjects/ElasticsearchJsonParser/src/data/ldc_uyghur_3.json"));

                    
        //TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {};
        List<DataEntry> dataEntryObjects = objectMapper.readValue(dataFile, new TypeReference<List<DataEntry>>(){});
        List<Cluster> clusterObjects = objectMapper.readValue(dataFile, new TypeReference<List<Cluster>>(){});

        //HashMap<String, Object> o = objectMapper.readValue(dataFile, typeRef);

        //DataEntry dataEntry = objectMapper.readValue(dataFile, DataEntry.class);
        //Cluster cluster = objectMapper.readValue(clusterFile, Cluster.class);

        String prettyData = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dataEntryObjects);
        String prettyCluster = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(clusterObjects);
        System.out.println(prettyData);
        //cluster.clusterPresent();
        //System.out.println(prettyCluster);
        //parseJSON(jParser);
        
        
        
    }

    private static void parseJSON(JsonParser jsonParser)
            throws JsonParseException, IOException {
        String currentID;
        try {
            //JsonFactory jfactory = new JsonFactory();
            //JsonParser jParser = jfactory.createJsonParser(new File("/home/HQ/kbaik/NetBeansProjects/ElasticsearchJsonParser/src/data/ldc_uyghur_3.json"));

            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {

                String fieldname = jsonParser.getCurrentName();
                if ("_index".equals(fieldname)) {
                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText());

                }

                if ("_type".equals(fieldname)) {

                    jsonParser.nextToken();
                    System.out.println(jsonParser.getText()); 

                }
                
                if("id".equals(fieldname)){
                    jsonParser.nextToken();
                    currentID = jsonParser.getText();
                    System.out.println(jsonParser.getText());
                }

                if ("sadfsadf".equals(fieldname)) {

                    jsonParser.nextToken(); // current token is "[", move next

                    // messages is array, loop until token equal to "]"
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {

                        // display msg1, msg2, msg3
                        System.out.println(jsonParser.getText());

                    }

                }

            }
            jsonParser.close();

        } catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}

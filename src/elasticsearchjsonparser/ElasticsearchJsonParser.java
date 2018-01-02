package elasticsearchjsonparser;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
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
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import org.codehaus.jackson.util.DefaultPrettyPrinter.Lf2SpacesIndenter;

/**
 *
 * @author KBAI
 */
public class ElasticsearchJsonParser {

    public static void main(String[] args) throws JsonParseException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        File clusterFile = new File("src/data/LDC_clustering.json");
        File dataFile = new File("src/data/ldc_uyghur_4.json");

        JsonFactory jfactory = new JsonFactory();
        JsonParser jParser = jfactory.createJsonParser(
                new File("src/data/ldc_uyghur_3.json"));

        //TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {};
        List<DataEntry> dataEntryObjects = objectMapper.readValue(dataFile, new TypeReference<List<DataEntry>>() {
        });
        List<Cluster> clusterObjects = objectMapper.readValue(clusterFile, new TypeReference<List<Cluster>>() {
        });

        //HashMap<String, Object> o = objectMapper.readValue(dataFile, typeRef);
        //DataEntry dataEntry = objectMapper.readValue(dataFile, DataEntry.class);
        //Cluster cluster = objectMapper.readValue(clusterFile, Cluster.class);
        String prettyData = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dataEntryObjects);
        String prettyCluster = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(clusterObjects);
        //System.out.println(prettyData);
        //System.out.println(prettyCluster);
        List<DataEntry> dataClusterObjects = getCluster(dataEntryObjects, clusterObjects);
        toJson(dataEntryObjects);
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

                if ("id".equals(fieldname)) {
                    jsonParser.nextToken();
                    currentID = jsonParser.getText();
                    System.out.println(jsonParser.getText());
                }

            }
            jsonParser.close();

        } catch (JsonGenerationException | JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<DataEntry> getCluster(List<DataEntry> dataEntryList, List<Cluster> clusterList) {
        int dataEntryLength = dataEntryList.size();
        int clusterLength = clusterList.size();
        for (int i = 0; i < dataEntryLength; i++) {
            for (int j = 0; j < clusterLength; j++) {
                //dataEntryList.get(i).setClusterPresent( 
                //        clusterList.get(j).getClusterPresentIn(dataEntryList.get(i)._source.getId()));
                //System.out.println(dataEntryList.get(i)._source.getId());
                if (clusterList.get(j).isPresent(dataEntryList.get(i)._source.getId())) {
                    dataEntryList.get(i).addClusterPresent(clusterList.get(j).getclusterNumber());
                }
                dataEntryList.get(i).setClusterPresent(dataEntryList.get(i).clusterPresent);
                //System.out.println("i, j :"+i+j+clusterList.get(j).isPresent(dataEntryList.get(i)._source.getId()));
            }
        }

        return dataEntryList;
    }

    private static void toJson(List<DataEntry> dataEntryList) {
        ObjectMapper mapper = new ObjectMapper();
        DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
        printer.withRootSeparator("\n");
        mapper.setSerializationConfig(mapper.getSerializationConfig().withSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY));
        try {
            //Convert object to JSON string and save into file directly
            //mapper.writeValue(new File("ldc_uyghur_clustering.json"), dataEntryList);

            //Convert object to JSON string
            String jsonInString = mapper.writeValueAsString(dataEntryList);
            //System.out.println(jsonInString);

            //Convert object to JSON string and pretty print
            jsonInString = mapper.writeValueAsString(dataEntryList);
            //System.out.println(jsonInString);
            //mapper.writeValue(new File("ldc_uyghur_clustering.json"), jsonInString);
            mapper.writeValue(new File("ldc_uyghur_clustering.json"), dataEntryList);


        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package elasticsearchjsonparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author kbaik
 */
public class Cluster {
    private String clusterNumber;
    private List<String> clusterGroup;

    
    /**
     * @return the ClusterNumber
     */
    public String getclusterNumber() {
        return this.clusterNumber;
    }

    /**
     * @param ClusterNumber the ClusterNumber to set
     */
    public void setclusterNumber(String clusterNumber) {
        this.clusterNumber = clusterNumber;
    }

    /**
     * @return the clusterGroup
     */
    public List<String> getclusterGroup() {
        return this.clusterGroup;
    }

    /**
     * @param clusterGroup the clusterGroup to set
     */
    public void setclusterGroup(List<String> clusterGroup) {
        this.clusterGroup = clusterGroup;
    }
    
}

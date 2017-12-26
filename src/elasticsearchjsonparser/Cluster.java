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
    HashMap<String, List<String>> cluster;
    ArrayList<Integer> presentInCluster;
    int clusterNum;
    List<String> currentCluster;
    
    public Cluster(){
        this.cluster = new HashMap<>();
        presentInCluster = new ArrayList<>();
        clusterNum = cluster.size();
    }
    
    public boolean isPresent(String ID){
        for(int i = 0; i < clusterNum; i++){
            currentCluster = cluster.get(i);
            if(currentCluster.contains(ID)){
                presentInCluster.add(i);
            }
        }
        
        if(presentInCluster.isEmpty()){
            return false;
        }else{
            return false;
        }
    }
    
    public ArrayList<Integer> clusterPresent(){
        System.out.println("Present in Cluster: "+ presentInCluster);
        return presentInCluster;
    }
}

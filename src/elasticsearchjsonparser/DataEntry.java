package elasticsearchjsonparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.xml.crypto.Data;

/**
 *
 * @author kbaik
 */
public class DataEntry {
    private String _index; //= "ldc_clustering";
    private String _type; //= "ui_output";
    private String _id;
    private String _score;
    private int clusterID;
    public _source _source;
    public List<String> clusterPresent;
    
    public void set_index(String _index){
        this._index = _index;
    }

    public void set_type(String _type){
        this._type = _type;
    }

    public void setClusterID(int clusterID){
        this.clusterID = clusterID;
    }

    public String get_index(){
        return this._index;
    }

    public String get_type(){
        return this._type;
    }

    public int getClusterID(){
        return this.clusterID;
    }
    
    /**
     * @return the _score
     */
    public String get_score() {
        return _score;
    }

    /**
     * @param _score the _score to set
     */
    public void set_score(String _score) {
        this._score = _score;
    }
    
    public void set_id(String id){
        this._id = id;
    }

    /**
     * @return the sourceID
     */
    public String get_id() {
        return this._id;
    }
    
    /**
     * @return the _source
     */
    public _source get_source() {
        return _source;
    }

    /**
     * @param _source the _source to set
     */
    public void set_source(_source _source) {
        this._source = _source;
    }
    /**
     * @return the clusterPresent
     */
    public List<String> getClusterPresent() {
        return clusterPresent;
    }

    /**
     * @param clusterPresent the clusterPresent to set
     */
    public void setClusterPresent(List<String> clusterPresent) {
        this.clusterPresent = clusterPresent;
    }
    
}

package elasticsearchjsonparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kbaik
 */
public class DataEntry {
    private String _index; //= "ldc_clustering";
    private String _type; //= "ui_output";
    private String _id;
    private String _score;
    private String id; //source id
    private int clusterID;

    public void setIndex(String _index){
        this._index = _index;
    }

    public void setType(String type){
        this._type = type;
    }

    public void setClusterID(int clusterID){
        this.clusterID = clusterID;
    }

    public String getIndex(){
        return this._index;
    }

    public String getType(){
        return this._type;
    }

    public int getClusterID(){
        return this.clusterID;
    }
    
    /**
     * @return the _score
     */
    public String getScore() {
        return _score;
    }

    /**
     * @param _score the _score to set
     */
    public void setScore(String _score) {
        this._score = _score;
    }
    
    public void setID(String id){
        this.id = id;
    }

    /**
     * @return the sourceID
     */
    public String getID() {
        return this.id;
    }

}

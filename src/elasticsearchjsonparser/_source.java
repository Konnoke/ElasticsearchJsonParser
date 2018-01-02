/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elasticsearchjsonparser;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author kbaik
 */
public class _source {
    private String originalText;
    private String createdAt;
    private String translatedText;
    private String language;
    private String id;
    private String sentimentString;
    private String[] LOC;
    private List<String> GPE;
    private List<String> PER;
    private List<String> ORG;
    private List<String> topics;
    private List<geoLocations> geoLocations;
    private List<String> cluster;
    private double Xcoordinate;
    private double Ycoordinate;
    /**
     * @return the LOC
     */
    @JsonProperty("LOC")
    public String[] getLOC() {
        return this.LOC;
    }

    /**
     * @param LOC the LOC to set
     */
    @JsonProperty("LOC")
    public void setLOC(String[] LOC) {
        this.LOC = LOC;
    }

    /**
     * @return the GPE
     */
    @JsonProperty("GPE")
    public List<String> getGPE() {
        return this.GPE;
    }

    /**
     * @param GPE the GPE to set
     */
    @JsonProperty("GPE")
    public void setGPE(List<String> GPE) {
        this.GPE = GPE;
    }

    /**
     * @return the PER
     */
    @JsonProperty("PER")
    public List<String> getPER() {
        return this.PER;
    }

    /**
     * @param PER the PER to set
     */
    @JsonProperty("PER")
    public void setPER(List<String> PER) {
        this.PER = PER;
    }

    /**
     * @return the ORG
     */
    @JsonProperty("ORG")
    public List<String> getORG() {
        return this.ORG;
    }

    /**
     * @param ORG the ORG to set
     */
    @JsonProperty("ORG")
    public void setORG(List<String> ORG) {
        this.ORG = ORG;
    }
    
    /**
     * @return the topics
     */
    @JsonProperty("topics")
    public List<String> getTopics() {
        return topics;
    }

    /**
     * @param topics the topics to set
     */
    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    /**
     * @return the geoLocations
     */
    public List<geoLocations> getGeoLocations() {
        return this.geoLocations;
    }

    /**
     * @param geoLocations the geoLocations to set
     */
    public void setGeoLocations(List<geoLocations> geoLocations) {
        this.geoLocations = geoLocations;
    }

    /**
     * @return the originalText
     */
    public String getOriginalText() {
        return originalText;
    }

    /**
     * @param originalText the originalText to set
     */
    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    /**
     * @return the createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the translatedText
     */
    public String getTranslatedText() {
        return this.translatedText;
    }

    /**
     * @param translatedText the translatedText to set
     */
    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the sentimentString
     */
    public String getSentimentString() {
        return this.sentimentString;
    }

    /**
     * @param sentimentString the sentimentString to set
     */
    public void setSentimentString(String sentimentString) {
        this.sentimentString = sentimentString;
    }
    
    /**
     * @return the cluster
     */
    public List<String> getCluster() {
        return cluster;
    }

    /**
     * @param cluster the cluster to set
     */
    public void setCluster(List<String> cluster) {
        this.cluster = cluster;
    }
    
    
    /**
     * @return the Xcoordinate
     */
    @JsonProperty("Xcoordinate")
    public double getXcoordinate() {
        return Xcoordinate;
    }

    /**
     * @param Xcoordinate the Xcoordinate to set
     */
     @JsonProperty("Xcoordinate")
    public void setXcoordinate(double Xcoordinate) {
        this.Xcoordinate = Xcoordinate;
    }

    /**
     * @return the Ycoordinate
     */
     @JsonProperty("Ycoordinate")
    public double getYcoordinate() {
        return Ycoordinate;
    }

    /**
     * @param Ycoordinate the Ycoordinate to set
     */
     @JsonProperty("Ycoordinate")
    public void setYcoordinate(double Ycoordinate) {
        this.Ycoordinate = Ycoordinate;
    }
    
    public void addCluster(List<String> clusterPresent){
        if(this.cluster == null){
            this.cluster = new ArrayList<>();
        }
        for(int i = 0; i < clusterPresent.size();i++){
            this.cluster.add(clusterPresent.get(i));
        }
    }
    
}

class geoLocations{

    /**
     * @return the lat
     */
    public Double getlat() {
        return this.lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setlat(Double lat) {
        this.lat = lat;
    }

    /**
     * @return the lon
     */
    public Double getlon() {
        return this.lon;
    }

    /**
     * @param lon the lon to set
     */
    public void setlon(Double lon) {
        this.lon = lon;
    }

    /**
     * @return the geohash
     */
    public String getgeohash() {
        return this.geohash;
    }

    /**
     * @param geohash the geohash to set
     */
    public void setgeohash(String geohash) {
        this.geohash = geohash;
    }
    
    private Double lat;
    private Double lon;
    private String geohash;
    
}

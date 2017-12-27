/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elasticsearchjsonparser;

import java.util.List;

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
    private List<String> LOC;
    private List<String> GPE;
    private List<String> PER;
    private List<String> ORG;
    private List<geoLocations> geoLocations;
    /**
     * @return the LOC
     */
    public List<String> getLOC() {
        return this.LOC;
    }

    /**
     * @param LOC the LOC to set
     */
    public void setLOC(List<String> LOC) {
        this.LOC = LOC;
    }

    /**
     * @return the GPE
     */
    public List<String> getGPE() {
        return this.GPE;
    }

    /**
     * @param GPE the GPE to set
     */
    public void setGPE(List<String>GPE) {
        this.GPE = GPE;
    }

    /**
     * @return the PER
     */
    public List<String> getPER() {
        return this.PER;
    }

    /**
     * @param PER the PER to set
     */
    public void setPER(List<String> PER) {
        this.PER = PER;
    }

    /**
     * @return the ORG
     */
    public List<String> getORG() {
        return this.ORG;
    }

    /**
     * @param ORG the ORG to set
     */
    public void setORG(List<String>ORG) {
        this.ORG = ORG;
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
    
}

class geoLocations{

    /**
     * @return the lat
     */
    public String getlat() {
        return this.lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setlat(String lat) {
        this.lat = lat;
    }

    /**
     * @return the lon
     */
    public String getlon() {
        return this.lon;
    }

    /**
     * @param lon the lon to set
     */
    public void setlon(String lon) {
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
    
    private String lat;
    private String lon;
    private String geohash;
    
}

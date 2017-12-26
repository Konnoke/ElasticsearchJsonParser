/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elasticsearchjsonparser;

/**
 *
 * @author kbaik
 */
public class _source {

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
        return createdAt;
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
        return translatedText;
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
        return language;
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
        return id;
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
        return sentimentString;
    }

    /**
     * @param sentimentString the sentimentString to set
     */
    public void setSentimentString(String sentimentString) {
        this.sentimentString = sentimentString;
    }
    private String originalText;
    private String createdAt;
    private String translatedText;
    private String language;
    private String id;
    private String sentimentString;
    
    
}

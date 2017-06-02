package com.podcasphere.entity;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * List of iTunes responses
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "resultCount",
        "results"
})
public class ItunesResponses {

    @JsonProperty("resultCount")
    private long resultCount;

    @JsonProperty("results")
    private List<ItunesResponse> results;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = -4095586235319292321L;

    @JsonProperty("resultCount")
    public long getResultCount() {
        return resultCount;
    }

    @JsonProperty("resultCount")
    public void setResultCount(long resultCount) {
        this.resultCount = resultCount;
    }

    @JsonProperty("results")
    public List<ItunesResponse> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<ItunesResponse> results) {
        this.results = results;
    }

//    @Override
//    public String toString() {
//        return ToStringBuilder.reflectionToString(this);
//    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(resultCount).append(results).append(additionalProperties).toHashCode();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof ItunesResponses) == false) {
//            return false;
//        }
//        Example rhs = ((Example) other);
//        return new EqualsBuilder().append(resultCount, rhs.resultCount).append(results, rhs.results).append(additionalProperties, rhs.additionalProperties).isEquals();
//    }
}

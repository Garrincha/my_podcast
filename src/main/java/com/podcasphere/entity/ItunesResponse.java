package com.podcasphere.entity;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * iTunes response details
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "wrapperType",
        "kind",
        "artistId",
        "collectionId",
        "trackId",
        "artistName",
        "collectionName",
        "trackName",
        "collectionCensoredName",
        "trackCensoredName",
        "artistViewUrl",
        "collectionViewUrl",
        "feedUrl",
        "trackViewUrl",
        "artworkUrl30",
        "artworkUrl60",
        "artworkUrl100",
        "collectionPrice",
        "trackPrice",
        "trackRentalPrice",
        "collectionHdPrice",
        "trackHdPrice",
        "trackHdRentalPrice",
        "releaseDate",
        "collectionExplicitness",
        "trackExplicitness",
        "trackCount",
        "country",
        "currency",
        "primaryGenreName",
        "contentAdvisoryRating",
        "artworkUrl600",
        "genreIds",
        "genres"
})
public class ItunesResponse {

    @JsonProperty("wrapperType")
    private String wrapperType;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("artistId")
    private long artistId;

    @JsonProperty("collectionId")
    private long collectionId;

    @JsonProperty("trackId")
    private long trackId;

    @JsonProperty("artistName")
    private String artistName;

    @JsonProperty("collectionName")
    private String collectionName;

    @JsonProperty("trackName")
    private String trackName;

    @JsonProperty("collectionCensoredName")
    private String collectionCensoredName;

    @JsonProperty("trackCensoredName")
    private String trackCensoredName;

    @JsonProperty("artistViewUrl")
    private String artistViewUrl;

    @JsonProperty("collectionViewUrl")
    private String collectionViewUrl;

    @JsonProperty("feedUrl")
    private String feedUrl;

    @JsonProperty("trackViewUrl")
    private String trackViewUrl;

    @JsonProperty("artworkUrl30")
    private String artworkUrl30;

    @JsonProperty("artworkUrl60")
    private String artworkUrl60;

    @JsonProperty("artworkUrl100")
    private String artworkUrl100;

    @JsonProperty("collectionPrice")
    private double collectionPrice;

    @JsonProperty("trackPrice")
    private double trackPrice;

    @JsonProperty("trackRentalPrice")
    private long trackRentalPrice;

    @JsonProperty("collectionHdPrice")
    private long collectionHdPrice;

    @JsonProperty("trackHdPrice")
    private long trackHdPrice;

    @JsonProperty("trackHdRentalPrice")
    private long trackHdRentalPrice;

    @JsonProperty("releaseDate")
    private String releaseDate;

    @JsonProperty("collectionExplicitness")
    private String collectionExplicitness;

    @JsonProperty("trackExplicitness")
    private String trackExplicitness;

    @JsonProperty("trackCount")
    private long trackCount;

    @JsonProperty("country")
    private String country;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("primaryGenreName")
    private String primaryGenreName;

    @JsonProperty("contentAdvisoryRating")
    private String contentAdvisoryRating;

    @JsonProperty("artworkUrl600")
    private String artworkUrl600;

    @JsonProperty("genreIds")
    private List<String> genreIds = null;

    @JsonProperty("genres")
    private List<String> genres = null;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = 2615759880506679739L;

    @JsonProperty("wrapperType")
    public String getWrapperType() {
        return wrapperType;
    }

    @JsonProperty("wrapperType")
    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("artistId")
    public long getArtistId() {
        return artistId;
    }

    @JsonProperty("artistId")
    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    @JsonProperty("collectionId")
    public long getCollectionId() {
        return collectionId;
    }

    @JsonProperty("collectionId")
    public void setCollectionId(long collectionId) {
        this.collectionId = collectionId;
    }

    @JsonProperty("trackId")
    public long getTrackId() {
        return trackId;
    }

    @JsonProperty("trackId")
    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    @JsonProperty("artistName")
    public String getArtistName() {
        return artistName;
    }

    @JsonProperty("artistName")
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @JsonProperty("collectionName")
    public String getCollectionName() {
        return collectionName;
    }

    @JsonProperty("collectionName")
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    @JsonProperty("trackName")
    public String getTrackName() {
        return trackName;
    }

    @JsonProperty("trackName")
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    @JsonProperty("collectionCensoredName")
    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    @JsonProperty("collectionCensoredName")
    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    @JsonProperty("trackCensoredName")
    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    @JsonProperty("trackCensoredName")
    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    @JsonProperty("artistViewUrl")
    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    @JsonProperty("artistViewUrl")
    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    @JsonProperty("collectionViewUrl")
    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    @JsonProperty("collectionViewUrl")
    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    @JsonProperty("feedUrl")
    public String getFeedUrl() {
        return feedUrl;
    }

    @JsonProperty("feedUrl")
    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    @JsonProperty("trackViewUrl")
    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    @JsonProperty("trackViewUrl")
    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    @JsonProperty("artworkUrl30")
    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    @JsonProperty("artworkUrl30")
    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    @JsonProperty("artworkUrl60")
    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    @JsonProperty("artworkUrl60")
    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    @JsonProperty("artworkUrl100")
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    @JsonProperty("artworkUrl100")
    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    @JsonProperty("collectionPrice")
    public double getCollectionPrice() {
        return collectionPrice;
    }

    @JsonProperty("collectionPrice")
    public void setCollectionPrice(double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    @JsonProperty("trackPrice")
    public double getTrackPrice() {
        return trackPrice;
    }

    @JsonProperty("trackPrice")
    public void setTrackPrice(double trackPrice) {
        this.trackPrice = trackPrice;
    }

    @JsonProperty("trackRentalPrice")
    public long getTrackRentalPrice() {
        return trackRentalPrice;
    }

    @JsonProperty("trackRentalPrice")
    public void setTrackRentalPrice(long trackRentalPrice) {
        this.trackRentalPrice = trackRentalPrice;
    }

    @JsonProperty("collectionHdPrice")
    public long getCollectionHdPrice() {
        return collectionHdPrice;
    }

    @JsonProperty("collectionHdPrice")
    public void setCollectionHdPrice(long collectionHdPrice) {
        this.collectionHdPrice = collectionHdPrice;
    }

    @JsonProperty("trackHdPrice")
    public long getTrackHdPrice() {
        return trackHdPrice;
    }

    @JsonProperty("trackHdPrice")
    public void setTrackHdPrice(long trackHdPrice) {
        this.trackHdPrice = trackHdPrice;
    }

    @JsonProperty("trackHdRentalPrice")
    public long getTrackHdRentalPrice() {
        return trackHdRentalPrice;
    }

    @JsonProperty("trackHdRentalPrice")
    public void setTrackHdRentalPrice(long trackHdRentalPrice) {
        this.trackHdRentalPrice = trackHdRentalPrice;
    }

    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonProperty("collectionExplicitness")
    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    @JsonProperty("collectionExplicitness")
    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    @JsonProperty("trackExplicitness")
    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    @JsonProperty("trackExplicitness")
    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    @JsonProperty("trackCount")
    public long getTrackCount() {
        return trackCount;
    }

    @JsonProperty("trackCount")
    public void setTrackCount(long trackCount) {
        this.trackCount = trackCount;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("primaryGenreName")
    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    @JsonProperty("primaryGenreName")
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    @JsonProperty("contentAdvisoryRating")
    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    @JsonProperty("contentAdvisoryRating")
    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    @JsonProperty("artworkUrl600")
    public String getArtworkUrl600() {
        return artworkUrl600;
    }

    @JsonProperty("artworkUrl600")
    public void setArtworkUrl600(String artworkUrl600) {
        this.artworkUrl600 = artworkUrl600;
    }

    @JsonProperty("genreIds")
    public List<String> getGenreIds() {
        return genreIds;
    }

    @JsonProperty("genreIds")
    public void setGenreIds(List<String> genreIds) {
        this.genreIds = genreIds;
    }

    @JsonProperty("genres")
    public List<String> getGenres() {
        return genres;
    }

    @JsonProperty("genres")
    public void setGenres(List<String> genres) {
        this.genres = genres;
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
//        return new HashCodeBuilder().append(wrapperType).append(kind).append(artistId).append(collectionId).append(trackId).append(artistName).append(collectionName).append(trackName).append(collectionCensoredName).append(trackCensoredName).append(artistViewUrl).append(collectionViewUrl).append(feedUrl).append(trackViewUrl).append(artworkUrl30).append(artworkUrl60).append(artworkUrl100).append(collectionPrice).append(trackPrice).append(trackRentalPrice).append(collectionHdPrice).append(trackHdPrice).append(trackHdRentalPrice).append(releaseDate).append(collectionExplicitness).append(trackExplicitness).append(trackCount).append(country).append(currency).append(primaryGenreName).append(contentAdvisoryRating).append(artworkUrl600).append(genreIds).append(genres).append(additionalProperties).toHashCode();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof Result) == false) {
//            return false;
//        }
//        Result rhs = ((Result) other);
//        return new EqualsBuilder().append(wrapperType, rhs.wrapperType).append(kind, rhs.kind).append(artistId, rhs.artistId).append(collectionId, rhs.collectionId).append(trackId, rhs.trackId).append(artistName, rhs.artistName).append(collectionName, rhs.collectionName).append(trackName, rhs.trackName).append(collectionCensoredName, rhs.collectionCensoredName).append(trackCensoredName, rhs.trackCensoredName).append(artistViewUrl, rhs.artistViewUrl).append(collectionViewUrl, rhs.collectionViewUrl).append(feedUrl, rhs.feedUrl).append(trackViewUrl, rhs.trackViewUrl).append(artworkUrl30, rhs.artworkUrl30).append(artworkUrl60, rhs.artworkUrl60).append(artworkUrl100, rhs.artworkUrl100).append(collectionPrice, rhs.collectionPrice).append(trackPrice, rhs.trackPrice).append(trackRentalPrice, rhs.trackRentalPrice).append(collectionHdPrice, rhs.collectionHdPrice).append(trackHdPrice, rhs.trackHdPrice).append(trackHdRentalPrice, rhs.trackHdRentalPrice).append(releaseDate, rhs.releaseDate).append(collectionExplicitness, rhs.collectionExplicitness).append(trackExplicitness, rhs.trackExplicitness).append(trackCount, rhs.trackCount).append(country, rhs.country).append(currency, rhs.currency).append(primaryGenreName, rhs.primaryGenreName).append(contentAdvisoryRating, rhs.contentAdvisoryRating).append(artworkUrl600, rhs.artworkUrl600).append(genreIds, rhs.genreIds).append(genres, rhs.genres).append(additionalProperties, rhs.additionalProperties).isEquals();
//    }

}
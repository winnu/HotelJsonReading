package com.example.hoteljsonreading;



import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class HotelSummary implements Serializable 
{
	private static final long serialVersionUID = 1L;
	

	private String order;
	 
    private String address1;

    private String hotelId;

    private String tripAdvisorReviewCount;

    private String city;

    private String confidenceRating;

    private String propertyCategory;

    private String postalCode;

    private String name;

    private String hotelRating;

    private String longitude;

    private String rateCurrencyCode;

    private String proximityDistance;

    private String locationDescription;

    private String deepLink;

    private String countryCode;

    private String tripAdvisorRatingUrl;

    private String thumbNailUrl;

    private String proximityUnit;

    private String tripAdvisorRating;

    private String lowRate;

    private String shortDescription;

    private String highRate;

    private String airportCode;

    private String latitude;

    private String hotelInDestination;

    private String amenityMask;
    
    
    public String getOrder ()
    {
        return order;
    }

    
    public void setOrder (String order)
    {
        this.order = order;
    }

    public String getAddress1 ()
    {
        return address1;
    }

    public void setAddress1 (String address1)
    {
        this.address1 = address1;
    }

    public String getHotelId ()
    {
        return hotelId;
    }

    public void setHotelId (String hotelId)
    {
        this.hotelId = hotelId;
    }

    public String getTripAdvisorReviewCount ()
    {
        return tripAdvisorReviewCount;
    }

    public void setTripAdvisorReviewCount (String tripAdvisorReviewCount)
    {
        this.tripAdvisorReviewCount = tripAdvisorReviewCount;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getConfidenceRating ()
    {
        return confidenceRating;
    }

    public void setConfidenceRating (String confidenceRating)
    {
        this.confidenceRating = confidenceRating;
    }

    public String getPropertyCategory ()
    {
        return propertyCategory;
    }

    public void setPropertyCategory (String propertyCategory)
    {
        this.propertyCategory = propertyCategory;
    }

    public String getPostalCode ()
    {
        return postalCode;
    }

    public void setPostalCode (String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getHotelRating ()
    {
        return hotelRating;
    }

    public void setHotelRating (String hotelRating)
    {
        this.hotelRating = hotelRating;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    public String getRateCurrencyCode ()
    {
        return rateCurrencyCode;
    }

    public void setRateCurrencyCode (String rateCurrencyCode)
    {
        this.rateCurrencyCode = rateCurrencyCode;
    }

    public String getProximityDistance ()
    {
        return proximityDistance;
    }

    public void setProximityDistance (String proximityDistance)
    {
        this.proximityDistance = proximityDistance;
    }

    public String getLocationDescription ()
    {
        return locationDescription;
    }

    public void setLocationDescription (String locationDescription)
    {
        this.locationDescription = locationDescription;
    }

    public String getDeepLink ()
    {
        return deepLink;
    }

    public void setDeepLink (String deepLink)
    {
        this.deepLink = deepLink;
    }

    public String getCountryCode ()
    {
        return countryCode;
    }

    public void setCountryCode (String countryCode)
    {
        this.countryCode = countryCode;
    }

    public String getTripAdvisorRatingUrl ()
    {
        return tripAdvisorRatingUrl;
    }

    public void setTripAdvisorRatingUrl (String tripAdvisorRatingUrl)
    {
        this.tripAdvisorRatingUrl = tripAdvisorRatingUrl;
    }

    public String getThumbNailUrl ()
    {
        return thumbNailUrl;
    }

    public void setThumbNailUrl (String thumbNailUrl)
    {
        this.thumbNailUrl = thumbNailUrl;
    }

    public String getProximityUnit ()
    {
        return proximityUnit;
    }

    public void setProximityUnit (String proximityUnit)
    {
        this.proximityUnit = proximityUnit;
    }

    public String getTripAdvisorRating ()
    {
        return tripAdvisorRating;
    }

    public void setTripAdvisorRating (String tripAdvisorRating)
    {
        this.tripAdvisorRating = tripAdvisorRating;
    }

    public String getLowRate ()
    {
        return lowRate;
    }

    public void setLowRate (String lowRate)
    {
        this.lowRate = lowRate;
    }

    public String getShortDescription ()
    {
        return shortDescription;
    }

    public void setShortDescription (String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public String getHighRate ()
    {
        return highRate;
    }

    public void setHighRate (String highRate)
    {
        this.highRate = highRate;
    }

    public String getAirportCode ()
    {
        return airportCode;
    }

    public void setAirportCode (String airportCode)
    {
        this.airportCode = airportCode;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getHotelInDestination ()
    {
        return hotelInDestination;
    }

    public void setHotelInDestination (String hotelInDestination)
    {
        this.hotelInDestination = hotelInDestination;
    }

    public String getAmenityMask ()
    {
        return amenityMask;
    }

    public void setAmenityMask (String amenityMask)
    {
        this.amenityMask = amenityMask;
    }
}
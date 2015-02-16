package com.example.hoteljsonreading;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"HotelListResponse"})
public class HotelTest {
	
	
	private String HotelListResponse;
	
	private String customerSessionId;

    private String moreResultsAvailable;

    private String numberOfRoomsRequested;
    
    public String getCustomerSessionId ()
    {
        return customerSessionId;
    }

    public void setCustomerSessionId (String customerSessionId)
    {
        this.customerSessionId = customerSessionId;
    }

    public String getMoreResultsAvailable ()
    {
        return moreResultsAvailable;
    }

    public void setMoreResultsAvailable (String moreResultsAvailable)
    {
        this.moreResultsAvailable = moreResultsAvailable;
    }

    public String getNumberOfRoomsRequested ()
    {
        return numberOfRoomsRequested;
    }

    public void setNumberOfRoomsRequested (String numberOfRoomsRequested)
    {
        this.numberOfRoomsRequested = numberOfRoomsRequested;
    }
}
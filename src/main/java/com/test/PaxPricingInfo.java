package com.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaxPricingInfo implements Serializable {


    private static final long serialVersionUID = -1851507451371366465L;

    @JsonProperty("paxInfoIndex")
    private BigInteger paxInfoIndex;
    @JsonProperty("paxType")
    private String paxType;
    @JsonProperty("pricingInfoList")
    private List<PricingInfo> pricingInfoList = new ArrayList<PricingInfo>();
    @JsonProperty("bookingInfoList")
    private List<BookingInfo> bookingInfoList = new ArrayList<BookingInfo>();

    public BigInteger getPaxInfoIndex() {
        return paxInfoIndex;
    }

    public void setPaxInfoIndex(BigInteger paxInfoIndex) {
        this.paxInfoIndex = paxInfoIndex;
    }

    public String getPaxType() {
        return paxType;
    }

    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    public List<PricingInfo> getPricingInfoList() {
        return pricingInfoList;
    }

    public void setPricingInfoList(List<PricingInfo> pricingInfoList) {
        this.pricingInfoList = pricingInfoList;
    }

    public List<BookingInfo> getBookingInfoList() {
        return bookingInfoList;
    }

    public void setBookingInfoList(List<BookingInfo> bookingInfoList) {
        this.bookingInfoList = bookingInfoList;
    }
}




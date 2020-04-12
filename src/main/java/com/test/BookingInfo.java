package com.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingInfo implements Serializable {


    private static final long serialVersionUID = -1498442415795143784L;

    @JsonProperty("index")
    private BigInteger index;

    @JsonProperty("segmentIndex")
    private BigInteger segmentIndex;

    @JsonProperty("pricingInfoIndex")
    private BigInteger pricingInfoIndex;

    @JsonProperty("bookingClass")
    private String bookingClass;

    @JsonProperty("cabinType")
    private String cabinType;

    @JsonProperty("ticketType")
    private String ticketType;

    @JsonProperty("bookingStatus")
    private String bookingStatus;

    @JsonProperty("ixiBookingStatus")
    private String ixiBookingStatus;

    @JsonProperty("airlinePnr")
    private String airlinePnr;

    @JsonProperty("gdsPnr")
    private String gdsPnr;

    @JsonProperty("ticketNumber")
    private String ticketNumber;

    @JsonProperty("externalRefs")
    private List externalRefs;

    public BigInteger getIndex() {
        return index;
    }

    public void setIndex(BigInteger index) {
        this.index = index;
    }

    public BigInteger getSegmentIndex() {
        return segmentIndex;
    }

    public void setSegmentIndex(BigInteger segmentIndex) {
        this.segmentIndex = segmentIndex;
    }

    public BigInteger getPricingInfoIndex() {
        return pricingInfoIndex;
    }

    public void setPricingInfoIndex(BigInteger pricingInfoIndex) {
        this.pricingInfoIndex = pricingInfoIndex;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public String getCabinType() {
        return cabinType;
    }

    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getAirlinePnr() {
        return airlinePnr;
    }

    public void setAirlinePnr(String airlinePnr) {
        this.airlinePnr = airlinePnr;
    }

    public String getGdsPnr() {
        return gdsPnr;
    }

    public void setGdsPnr(String gdsPnr) {
        this.gdsPnr = gdsPnr;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public List getExternalRefs() {
        return externalRefs;
    }

    public void setExternalRefs(List externalRefs) {
        this.externalRefs = externalRefs;
    }

    public String getIxiBookingStatus() {
        return ixiBookingStatus;
    }

    public void setIxiBookingStatus(String ixiBookingStatus) {
        this.ixiBookingStatus = ixiBookingStatus;
    }
}

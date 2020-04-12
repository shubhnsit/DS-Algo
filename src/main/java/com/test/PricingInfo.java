package com.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PricingInfo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -5416347636810711980L;
    @JsonProperty("index")
    private BigInteger index;
    @JsonProperty("fareBasisCode")
    private String fareBasisCode;
    @JsonProperty("comboCode")
    private String comboCode;
    @JsonProperty("fareKey")
    private String fareKey;
    @JsonProperty("fareType")
    private String fareType;
    @JsonProperty("fareSubType")
    private String fareSubType;
    @JsonProperty("pricingElements")
    private List<PricingElement> pricingElements;

    public String getComboCode() {
        return comboCode;
    }

    public void setComboCode(String comboCode) {
        this.comboCode = comboCode;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public String getFareSubType() {
        return fareSubType;
    }

    public void setFareSubType(String fareSubType) {
        this.fareSubType = fareSubType;
    }

    public BigInteger getIndex() {
        return index;
    }

    public void setIndex(BigInteger index) {
        this.index = index;
    }

    public String getFareBasisCode() {
        return fareBasisCode;
    }

    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    public String getFareKey() {
        return fareKey;
    }

    public void setFareKey(String fareKey) {
        this.fareKey = fareKey;
    }

    public List<PricingElement> getPricingElements() {
        return pricingElements;
    }

    public void setPricingElements(List<PricingElement> pricingElements) {
        this.pricingElements = pricingElements;
    }

}

package com.practice.restdemo.model;

public class CloudVender {
    private String vendorId;
    private String vandorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public CloudVender() {
    }

    public CloudVender(String vendorId, String vandorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vandorName = vandorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVandorName() {
        return vandorName;
    }

    public void setVandorName(String vandorName) {
        this.vandorName = vandorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}

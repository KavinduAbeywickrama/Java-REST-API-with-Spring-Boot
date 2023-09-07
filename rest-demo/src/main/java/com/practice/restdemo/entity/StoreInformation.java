package com.practice.restdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoreInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeId;
    private String storeDetail;
    private String storeName; // Corrected field name
    private String storePhoneNumber;

    public StoreInformation(){

    }

    public StoreInformation(String storeDetail, String storeName, String storePhoneNumber) {
        this.storeDetail = storeDetail;
        this.storeName = storeName;
        this.storePhoneNumber = storePhoneNumber;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreDetail() {
        return storeDetail;
    }

    public void setStoreDetail(String storeDetail) {
        this.storeDetail = storeDetail;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }
}

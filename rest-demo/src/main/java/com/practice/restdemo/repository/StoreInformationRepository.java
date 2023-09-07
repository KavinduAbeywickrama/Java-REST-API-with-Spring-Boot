package com.practice.restdemo.repository;
import com.practice.restdemo.entity.StoreInformation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreInformationRepository extends CrudRepository<StoreInformation, Integer> {
    List<StoreInformation> findByStoreName(String storeName); // Corrected parameter name
    List<StoreInformation> findByStorePhoneNumber(String phoneNumber);
    List<StoreInformation> findByStoreDetail(String detail);
}


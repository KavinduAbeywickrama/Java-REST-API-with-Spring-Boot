package com.practice.restdemo.service.impl;
import com.practice.restdemo.exception.CloudVendorNotCreateException;
import com.practice.restdemo.exception.CloundVendorNotFoundException;
import com.practice.restdemo.model.CloudVendor;
import com.practice.restdemo.repository.CloudVendorRepository;
import com.practice.restdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceimpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceimpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        //More Business logic
        if (cloudVendorRepository.existsById(cloudVendor.getVendorId()))
            throw new CloudVendorNotCreateException("Cloud Vendor Already Exist");
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        System.out.println(cloudVendorId);
        //More Business Logic
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloundVendorNotFoundException(" Requested Cloud Vendor NOt Exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {

        return cloudVendorRepository.findAll();
    }
}

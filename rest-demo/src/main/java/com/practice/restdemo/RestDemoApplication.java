package com.practice.restdemo;

import com.practice.restdemo.entity.StoreInformation;
import com.practice.restdemo.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestDemoApplication implements CommandLineRunner {

	@Autowired
	StoreInformationRepository storeInformationRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

	@Override
	public void run(String... args){
		StoreInformation storeInformationOne = new StoreInformation
				("Amazon", "All types of bags are available", "xxxx");
		StoreInformation storeInformationTwo = new StoreInformation
				("Flipkart", "All types of books are available", "xxxx");
		StoreInformation storeInformationThree = new StoreInformation
				("Meesho", "All fashion items are available here", "xxxx");
		StoreInformation storeInformationFour = new StoreInformation
				("Myntra", "All fashion items are available here", "xxxx");


		storeInformationRepository.save(storeInformationOne);
		storeInformationRepository.save(storeInformationTwo);
		storeInformationRepository.save(storeInformationThree);
		storeInformationRepository.save(storeInformationFour);

		storeInformationRepository.findByStoreName("Amazon").forEach(
				val -> System.out.println(val)
		);

		storeInformationRepository.findByStoreDetail("All fashion items are available here").forEach(
				val -> System.out.println(val)
		);

		storeInformationRepository.findByStorePhoneNumber("xxxx").forEach(
				val -> System.out.println(val)
		);

		storeInformationRepository.findById(2).ifPresent(
				val -> System.out.println(val)
		);

		System.out.println(storeInformationRepository.count());
	}
}



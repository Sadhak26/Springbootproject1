package com.SpringBoot.HotelDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringBoot.HotelDB.Model.Hotel;
import com.SpringBoot.HotelDB.Repository.HotelRepository;

@SpringBootApplication
public class HotelDatabaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HotelDatabaseApplication.class, args);
	}
	@Autowired
	private HotelRepository hotelRepository;
	@Override
	public void run(String... args) throws Exception{
		this.hotelRepository.save(new Hotel("Aslam","London", 987654321) );
		this.hotelRepository.save(new Hotel("Karan","Chennai", 817288367) );
	
	}

}

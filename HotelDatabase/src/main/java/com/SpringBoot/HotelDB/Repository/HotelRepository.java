package com.SpringBoot.HotelDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.HotelDB.Model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}

package com.example.hotel.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotel.entity.Hotel;
@Repository
public interface HotelReposistory  extends JpaRepository<Hotel, Long>{
	

}

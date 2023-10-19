package com.example.hotel.service;

import java.util.ArrayList;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.entity.Hotel;
import com.example.hotel.reposistory.HotelReposistory;

import antlr.collections.List;

@Service
public class HotelService {
	@Autowired
	private  HotelReposistory hotelreposistory;
	
	public void saveHotelDetails(Hotel hotel) {
		 hotelreposistory.save(hotel);
}
	
	public  java.util.List<Hotel> getalldetails()
	{
		return hotelreposistory.findAll();
	}
	public void deletebyid(Long id)
	{
		hotelreposistory.deleteById(id);
	}
	public Hotel getbyid(Long id)
	{
		return hotelreposistory.findById(id).orElse(null);
	}
	
	  public Hotel updateHotel(Long id, String newName) {
	        // Check if the entity with the given id exists
	        Optional<Hotel> optionalEntity = hotelreposistory.findById(id);
	        if (optionalEntity.isPresent()) {
	            Hotel entityToUpdate = optionalEntity.get();
	            entityToUpdate.setName(newName);
	            return hotelreposistory.save(entityToUpdate);
	        } else {
	            // Handle entity not found scenario
	            throw new EntityNotFoundException("Entity with ID " + id + " not found.");
	        }
	    }
	}
	 
	

package com.example.hotel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.constants.AppConstants;
import com.example.hotel.entity.Hotel;
import com.example.hotel.service.HotelService;

@RestController
@RequestMapping(value=AppConstants.HOTEL_CONTROLLER)
public class HotelController {
	@Autowired
	public HotelService hotelservice;
	
	
	@PostMapping(value=AppConstants.SAVE_HOTEL)
	 public void saveHotelDetails(@RequestBody Hotel  hotel) {
		  hotelservice.saveHotelDetails(hotel);
	 }
	@GetMapping(value=AppConstants.GET_HOTEL)
	
	 public @ResponseBody List<Hotel>getalldetails()
	 {
		return hotelservice.getalldetails(); 
	 }
	@DeleteMapping(value=AppConstants.DELETE_HOTEL)
	 
	 public void deletebyid(@RequestBody Long id)
	 {
		hotelservice.deletebyid(id);
	 }
	@GetMapping(value=AppConstants.GETBYID_HOTEL)
	
	public Hotel getbyid(@PathVariable Long id)
	{
		return hotelservice.getbyid(id);
	}
	
	 @PutMapping(value=AppConstants.UPDATEID_HOTEL)
	    public ResponseEntity<Hotel> updateHotel(@PathVariable Long id, @RequestBody String newName) {
	        Hotel updatedHotel = hotelservice.updateHotel(id, newName);
	        return ResponseEntity.ok(updatedHotel);
	    }
	}



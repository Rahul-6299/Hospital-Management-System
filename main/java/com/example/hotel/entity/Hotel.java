package com.example.hotel.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.example.hotel.constants.AppConstants;

import lombok.Data;
@Data
@Entity
@Table(name=AppConstants.HOTEL_INFO)

public class Hotel  implements Serializable{
	

	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;

	

	
	

}

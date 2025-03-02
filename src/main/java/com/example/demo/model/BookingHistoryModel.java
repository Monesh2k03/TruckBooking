package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class BookingHistoryModel {
	
	@Id
	private Long bookingId;
	private Long userId;
	private Long driverId;
	private String productName;
	private int productLength;
	private int productWidth;
	private int productWeight;
	private double pickUpLat;
	private double pickUplon;
	private String pickUpAddress;
	private double dropLat;
	private double droplon;
	private String dropAddress;
	private int bookingCharge;
	private String bookingStatus;
	private String date;
}

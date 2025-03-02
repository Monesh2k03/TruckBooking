package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class VehicleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vehicleId;
	private Long driverId;
	private String plateNo;
	private String driverLicense;
	private int vechicleCapacity;
	private int vechicleWidth;
	private int vechicleLength;
	private String vehicleType;
	private int minimumCharge;
	private int chargePerKm;

}

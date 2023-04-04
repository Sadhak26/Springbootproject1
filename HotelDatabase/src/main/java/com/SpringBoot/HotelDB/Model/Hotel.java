package com.SpringBoot.HotelDB.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roomNo;
	private String name;
	private String address;
	private long cellNo;
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getCellNo() {
		return cellNo;
	}
	public void setCellNo(long cellNo) {
		this.cellNo = cellNo;
	}
	public Hotel(String name, String address, long cellNo) {
		super();
		this.name = name;
		this.address = address;
		this.cellNo = cellNo;
	}
	
	public Hotel() {}

}

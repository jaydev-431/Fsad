package com.klef.fsad.exam;

import jakarta.persistence.*;



@Entity
public class Booking {
	@Id
	private int id;
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", date=" + date + ", status=" + status + "]";
	}
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String date;
	@Column(nullable=false)
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}

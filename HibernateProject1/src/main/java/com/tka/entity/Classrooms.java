package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classrooms {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clsId;
	private String clsName;
	private String clsFloor;
	private String clsLocation;
	private int clsStudCount;
	private int clsStudPlaced;

	public Classrooms() {
		// TODO Auto-generated constructor stub
	}
	public Classrooms(int clsId, String clsName, String clsFloor, String clsLocation, int clsStudCount,
			int clsStudPlaced) {
		super();
		this.clsId = clsId;
		this.clsName = clsName;
		this.clsFloor = clsFloor;
		this.clsLocation = clsLocation;
		this.clsStudCount = clsStudCount;
		this.clsStudPlaced = clsStudPlaced;
	}

	public Classrooms(String clsName, String clsFloor, String clsLocation, int clsStudCount, int clsStudPlaced) {
		super();
		this.clsName = clsName;
		this.clsFloor = clsFloor;
		this.clsLocation = clsLocation;
		this.clsStudCount = clsStudCount;
		this.clsStudPlaced = clsStudPlaced;
	}

	public int getClsId() {
		return clsId;
	}

	public void setClsId(int clsId) {
		this.clsId = clsId;
	}

	public String getClsName() {
		return clsName;
	}

	public void setClsName(String clsName) {
		this.clsName = clsName;
	}

	public String getClsFloor() {
		return clsFloor;
	}

	public void setClsFloor(String clsFloor) {
		this.clsFloor = clsFloor;
	}

	public String getClsLocation() {
		return clsLocation;
	}

	public void setClsLocation(String clsLocation) {
		this.clsLocation = clsLocation;
	}

	public int getClsStudCount() {
		return clsStudCount;
	}

	public void setClsStudCount(int clsStudCount) {
		this.clsStudCount = clsStudCount;
	}

	public int getClsStudPlaced() {
		return clsStudPlaced;
	}

	public void setClsStudPlaced(int clsStudPlaced) {
		this.clsStudPlaced = clsStudPlaced;
	}

	@Override
	public String toString() {
		return "Classrooms [clsId=" + clsId + ", clsName=" + clsName + ", clsFloor=" + clsFloor + ", clsLocation="
				+ clsLocation + ", clsStudCount=" + clsStudCount + ", clsStudPlaced=" + clsStudPlaced + "]";
	}

}

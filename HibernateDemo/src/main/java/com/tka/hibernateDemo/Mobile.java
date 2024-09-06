package com.tka.hibernateDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	//increment the id automatically through java annotation
	//@GeneratedValue( strategy = GenerationType.AUTO)
	int mobId;
	
	String MobBrandName;
	String mobCost;

	public Mobile() {

	}

	public Mobile(int mobId, String mobBrandName, String mobCost) {
		super();
		this.mobId = mobId;
		MobBrandName = mobBrandName;
		this.mobCost = mobCost;
	}
	public Mobile( String mobBrandName, String mobCost) {
		super();
		MobBrandName = mobBrandName;
		this.mobCost = mobCost;
	}
	public Mobile(int mobId) {
		super();
		this.mobId = mobId;
		
	}

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getMobBrandName() {
		return MobBrandName;
	}

	public void setMobBrandName(String mobBrandName) {
		MobBrandName = mobBrandName;
	}

	public String getMobCost() {
		return mobCost;
	}

	public void setMobCost(String mobCost) {
		this.mobCost = mobCost;
	}

	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", MobBrandName=" + MobBrandName + ", mobCost=" + mobCost + "]";
	}

}

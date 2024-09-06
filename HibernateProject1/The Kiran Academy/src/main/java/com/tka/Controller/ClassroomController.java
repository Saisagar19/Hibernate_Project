package com.tka.Controller;

import java.util.ArrayList;

import com.google.protobuf.Service;
import com.tka.Service.ClassroomService;
import com.tka.entity.Classrooms;
import com.tka.utility.ValidationUtility;

public class ClassroomController {

	public static ArrayList<Classrooms> fetchAllClassroomDetails() {
		ClassroomService service = new ClassroomService();
		ArrayList<Classrooms> list = service.loadAllClassroomDetails();
		return list;
	}

	public static Classrooms fetchClassroomDetailPerId(int clsId) {
		Classrooms classroom = null;
		ClassroomService service = new ClassroomService();
		if (!ValidationUtility.isNumberZero(clsId)) {
			classroom = service.loadClassroomDetailPerId(clsId);
		}
		return classroom;
	}

	public static Classrooms fetchAllDetailsByName(String clsName) {
		Classrooms classroom = null;
		if (!ValidationUtility.checkAnyTextBlankOrNull(clsName)) {
			ClassroomService service = new ClassroomService();
			classroom = service.loadAllDetailsByName(clsName);
		}
		return classroom;
	}

	public static ArrayList<Classrooms> fetchClassroomsDetailsByLocation(String clsLocation) {
		ClassroomService service = new ClassroomService();
		ArrayList<Classrooms> list = service.loadClassroomsDeatilByLocation(clsLocation);
		return list;
	}
	
	
	public static ArrayList<Classrooms> fetchAllClassroomHB() {
		ArrayList<Classrooms> listall = ClassroomService.loadAllClassroomHB();
		return listall;
	}
	
	
}

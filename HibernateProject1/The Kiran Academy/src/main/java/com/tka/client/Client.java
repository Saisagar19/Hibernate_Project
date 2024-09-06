package com.tka.client;
import java.util.ArrayList;

import com.tka.Controller.ClassroomController;
import com.tka.entity.Classrooms;

public class Client {
	public static void main(String[] args) {
		
//		ArrayList<Classrooms> listcls=ClassroomController.fetchAllClassroomDetails();
//		for (Classrooms classrooms : listcls) {
//			System.out.println(classrooms);
//		}
//		Classrooms classroom=ClassroomController.fetchClassroomDetailPerId(1102);
//		System.out.println(classroom);
		
//		Classrooms classroombyname=ClassroomController.fetchAllDetailsByName("KarveBatch 1");
//		System.out.println(classroombyname);
		
//		ArrayList<Classrooms> listcls=ClassroomController.fetchClassroomsDetailsByLocation("Warje,Pune");
//		for (Classrooms classrooms : listcls) {
//			System.out.println(classrooms);
//		}
		
		
		ArrayList<Classrooms> allClassroom = ClassroomController.fetchAllClassroomHB();
		for ( Classrooms classrooms : allClassroom) {
			System.out.println(classrooms);
		}
		
	}
}

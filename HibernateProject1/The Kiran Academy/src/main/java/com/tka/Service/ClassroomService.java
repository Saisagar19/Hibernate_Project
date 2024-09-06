package com.tka.Service;
import java.util.ArrayList;

import com.tka.Dao.ClassroomDao;
import com.tka.entity.Classrooms;

public class ClassroomService {

	public static ArrayList<Classrooms> loadAllClassroomDetails()
	{
		ArrayList<Classrooms> listcls= ClassroomDao.fetchAllClassroomDetails();
		return listcls;
	}

	public static Classrooms loadClassroomDetailPerId(int clsId)
	{
		Classrooms newClassrooms=new Classrooms();
		ArrayList<Classrooms> listcls= ClassroomDao.fetchAllClassroomDetails();
		//ArrayList<Classrooms> listcls= ClassroomDao.fetchClassroomDetailPerId(id);
		for (Classrooms classrooms : listcls) {
			if(clsId==classrooms.getClsId())
			{
				newClassrooms.setClsId(classrooms.getClsId());
				newClassrooms.setClsName(classrooms.getClsName());
				newClassrooms.setClsFloor(classrooms.getClsFloor());
				newClassrooms.setClsLocation(classrooms.getClsLocation());
				newClassrooms.setClsStudCount(classrooms.getClsStudCount());
				newClassrooms.setClsStudPlaced(classrooms.getClsStudPlaced());
			}

		}
		return newClassrooms;


	}
	public static Classrooms loadAllDetailsByName(String clsName)
	{
		//ArrayList<Classrooms> list=ClassroomDao.fetchAllDetailsByName(name);
		Classrooms className=new Classrooms();
		ArrayList<Classrooms> listcls= ClassroomDao.fetchAllClassroomDetails();
		for (Classrooms classrooms : listcls) {
			if(clsName.equals(classrooms.getClsName()))
			{
				className.setClsId(classrooms.getClsId());
				className.setClsName(classrooms.getClsName());
				className.setClsFloor(classrooms.getClsFloor());
				className.setClsLocation(classrooms.getClsLocation());
				className.setClsStudCount(classrooms.getClsStudCount());
				className.setClsStudPlaced(classrooms.getClsStudPlaced());

			}

		}

		return className;

	}

	public static ArrayList<Classrooms> loadClassroomsDeatilByLocation(String clsLocation)
	{
		//Classrooms location = new Classrooms();
		ArrayList<Classrooms> listcls= ClassroomDao.fetchAllClassroomDetails();
		ArrayList<Classrooms> list= new ArrayList<Classrooms>();
		//ArrayList<Classrooms> list=data.fetchClassroomsDetailByLocation(loc);
//		Classrooms classrooms=new Classrooms();
		for (Classrooms classrooms : listcls) {
			if(clsLocation.equals(classrooms.getClsLocation()))
			{
				list.add(classrooms);
//				location.setClsId(classroom.getClsId());
//				location.setClsName(classroom.getClsName());
//				location.setClsFloor(classroom.getClsFloor());
//				location.setClsLocation(classroom.getClsLocation());
//				location.setClsStudCount(classroom.getClsStudCount());
//				location.setClsStudPlaced(classroom.getClsStudPlaced());

			}
		}
			
		return list;
	}
	
	
	public static ArrayList<Classrooms> loadAllClassroomHB()
	{
		ArrayList<Classrooms> list = ClassroomDao.fetchAllClassroomHB();
		return list;
	}
	
	
	
}

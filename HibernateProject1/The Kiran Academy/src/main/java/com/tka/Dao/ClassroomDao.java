package com.tka.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Classrooms;
import com.tka.utility.DataBaseUtil;

public class ClassroomDao {

	public static ArrayList<Classrooms> fetchAllClassroomDetails() {
		ArrayList<Classrooms> listcls = new ArrayList<Classrooms>();
		try {

			// Class.forName("com.mysql.cj.jdbc.Driver");
			DataBaseUtil.loadDriver("com.mysql.cj.jdbc.Driver");
			// Connection
			// connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/TheKiranAcademy","root","root");
			Connection connection = DataBaseUtil.createConnection("jdbc:mysql://localhost:3306/TheKiranAcademy", "root",
					"root");
			// Statement stm=connection.createStatement();
			Statement stm = DataBaseUtil.createStatement(connection);
			String Query = "select * from classrooms";
			ResultSet s = DataBaseUtil.createResultSet(stm, Query);
			// ResultSet s=stm.executeQuery(Query);

			while (s.next()) {
				Classrooms cls = new Classrooms();
				int id = s.getInt(1);
				String name = s.getString(2);
				String floor = s.getString(3);
				String location = s.getString(4);
				int studCount = s.getInt(5);
				int studPlaced = s.getInt(6);
				cls.setClsId(id);
				cls.setClsName(name);
				cls.setClsFloor(floor);
				cls.setClsLocation(location);
				cls.setClsStudCount(studCount);
				cls.setClsStudPlaced(studPlaced);
				listcls.add(cls);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listcls;

	}

	public static ArrayList<Classrooms> fetchAllClassroomHB() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Classrooms.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria citeria = session.createCriteria(Classrooms.class);
		ArrayList<Classrooms> listcls = (ArrayList<Classrooms>) citeria.list();

		return listcls;
	}

//	public static ArrayList<Classrooms> fetchClassroomDetailPerId(int id)
//	{
//		Classrooms cls= new Classrooms();
//		ArrayList<Classrooms> listcls=new ArrayList<Classrooms>();
//		try {
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/TheKiranAcademy","root","root");
//			Statement stm=conn.createStatement();
//			String Query="select * from classrooms where clsId="+id;
//			ResultSet s=stm.executeQuery(Query);
//
//			while(s.next())
//			{
//				int clsid=s.getInt(1);
//				String name=s.getString(2);
//				String floor=s.getString(3);
//				String location=s.getString(4);
//				int studCount=s.getInt(5);
//				int studPlaced=s.getInt(6);
//				cls.setClsId(clsid);
//				cls.setClsName(name);
//				cls.setClsFloor(floor);
//				cls.setClsLocation(location);
//				cls.setClsStudCount(studCount);
//				cls.setClsStudPlaced(studPlaced);
//				listcls.add(cls);
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return listcls;
//	}
//	
//	public static ArrayList<Classrooms> fetchAllDetailsByName(String name)
//	{
//		
//		ArrayList<Classrooms> listcls=new ArrayList<Classrooms>();
//		try {
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/TheKiranAcademy","root","root");
//			String Query="select * from classrooms where clsName= ?";
//			PreparedStatement pstm=conn.prepareStatement(Query);
//			pstm.setString(1, name);
//			ResultSet s=pstm.executeQuery();
//
//			while(s.next())
//			{
//				Classrooms cls= new Classrooms();
//				int clsid=s.getInt(1);
//				String batchname=s.getString(2);
//				String floor=s.getString(3);
//				String location=s.getString(4);
//				int studCount=s.getInt(5);
//				int studPlaced=s.getInt(6);
//				cls.setClsId(clsid);
//				cls.setClsName(batchname);
//				cls.setClsFloor(floor);
//				cls.setClsLocation(location);
//				cls.setClsStudCount(studCount);
//				cls.setClsStudPlaced(studPlaced);
//				listcls.add(cls);
//			}
//				s.close();
//		        pstm.close();
//		        conn.close();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return listcls;
//
//	}
//	
//	public static ArrayList<Classrooms> fetchClassroomsDetailByLocation(String loc)
//	{
//		
//		ArrayList<Classrooms> listcls=new ArrayList<Classrooms>();
//		try {
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/TheKiranAcademy","root","root");
//			String Query="select * from classrooms where clsLocation= ?";
//			PreparedStatement pstm=conn.prepareStatement(Query);
//			pstm.setString(1, loc);
//			ResultSet s=pstm.executeQuery();
//
//			while(s.next())
//			{
//				Classrooms cls= new Classrooms();
//				int clsid=s.getInt(1);
//				String batchname=s.getString(2);
//				String floor=s.getString(3);
//				String location=s.getString(4);
//				int studCount=s.getInt(5);
//				int studPlaced=s.getInt(6);
//				cls.setClsId(clsid);
//				cls.setClsName(batchname);
//				cls.setClsFloor(floor);
//				cls.setClsLocation(location);
//				cls.setClsStudCount(studCount);
//				cls.setClsStudPlaced(studPlaced);
//				listcls.add(cls);
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return listcls;
//
//	
	// }

}

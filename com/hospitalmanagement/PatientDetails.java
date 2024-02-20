package com.hospitalmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientDetails {
	
	ArrayList<Entity> patientdata = new ArrayList<Entity>();
	
	public void addPatientDetails() {
		
		Entity entity = new Entity();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Patient's First name : ");
		entity.setPatientFname(sc.nextLine());
		System.out.println("Enter Patient's Last name : ");
		entity.setPatientLname(sc.nextLine());
		System.out.println("Enter Patient's Adress : ");
		entity.setAdress(sc.nextLine());
		System.out.println("Enter Patient's Gender : ");
		entity.setGender(sc.nextLine());
		System.out.println("Enter Patient's Age : ");
		entity.setAge(sc.nextShort());
		System.out.println("Enter Patient's Phone Number : ");
		entity.setPhoneNum(sc.nextLong());
		patientdata.add(entity);
	}

}

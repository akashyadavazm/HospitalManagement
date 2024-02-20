package com.hospitalmanagement;

import java.util.Scanner;

public class HospitalManagementMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		HospitalManagementMain management = new HospitalManagementMain();
		int choice = 0;
		PatientDetails details = new PatientDetails();

		while (choice < 2) {
			System.out.println("\"Enter your choice : \n 1-Add Patient Details : ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				details.addPatientDetails();
				break;
			case 2:
				break;

			}

		}
	}

}

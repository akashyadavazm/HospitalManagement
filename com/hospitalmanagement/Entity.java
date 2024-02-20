package com.hospitalmanagement;

public class Entity {
	
private String patientFname;
	
	private String patientLname;
	
	private String adress;
	
	private String gender;
	
	private short age;
	
	private long phoneNum;
	
	public String getPatientFname() {
		return patientFname;
	}
	
	public void setPatientFname(String patientFname) {
		this.patientFname = patientFname;
	}
	
	public String getPatientLname() {
		return patientLname;
	}
	
	public void setPatientLname(String patientLname) {
		this.patientLname = patientLname;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public short getAge() {
		return age;
	}
	
	public void setAge(short age) {
		this.age = age;
	}
	
	public long getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "PatientDetails [patientFname=" + patientFname + ", patientLname=" + patientLname + ", adress=" + adress
				+ ", gender=" + gender + ", age=" + age + ", phoneNum=" + phoneNum + "]";
	}

}

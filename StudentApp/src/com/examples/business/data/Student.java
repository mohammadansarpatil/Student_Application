package com.examples.business.data;

public class Student {
private int rollNo;
private String name;
private String gender;
private int maths;
private int physics;
private int chemistry;
private int compscience;
private String email;
private String city;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getMaths() {
	return maths;
}
public void setMaths(int maths) {
	this.maths = maths;
}
public int getPhysics() {
	return physics;
}
public void setPhysics(int physics) {
	this.physics = physics;
}
public int getChemistry() {
	return chemistry;
}
public void setChemistry(int chemistry) {
	this.chemistry = chemistry;
}
public int getCompscience() {
	return compscience;
}
public void setCompscience(int compscience) {
	this.compscience = compscience;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	int total = maths + chemistry + physics + compscience;
	return getRollNo()+"\t"+getName()+"\t\t"+getMaths()+"\t\t"+getPhysics()+"\t\t"
			+getChemistry()+"\t"+getCompscience()+"\t"+getEmail()+"\t"+getCity()+"\t\t"+total;


/*	return "Student [rollNo=" + rollNo + ", name=" + name + ", gender=" + gender + ", maths=" + maths + ", physics="
			+ physics + ", chemistry=" + chemistry + ", compscience=" + compscience + ", email=" + email + ", city="
			+ city + "]";*/
}

}

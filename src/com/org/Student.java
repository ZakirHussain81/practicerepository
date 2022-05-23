package com.org;

public class Student {
private int studentid;
private String studentname;
private int studentmarks;
private boolean studentstatus;
public Student() {
	super();
	setStudentstatus(true);
}
public Student(int studentid, String studentname, int studentmarks, boolean studentstatus) {
	super();
	this.setStudentid(studentid);
	this.setStudentname(studentname);
	this.setStudentmarks(studentmarks);
	this.setStudentstatus(studentstatus);
}
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getStudentmarks() {
	return studentmarks;
}
public void setStudentmarks(int studentmarks) {
	this.studentmarks = studentmarks;
}
public boolean isStudentstatus() {
	return studentstatus;
}
public void setStudentstatus(boolean studentstatus) {
	this.studentstatus = studentstatus;
}

}

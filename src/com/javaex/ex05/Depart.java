package com.javaex.ex05;

public class Depart extends Employee{

	 //코드작성
	private String clas;

	
	public Depart() {

	}
	public Depart(String name, int salary, String clas) {
		super(name, salary);
		this.clas = clas;
	}

	
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	
	public void showInformation() {
	        System.out.println("이름: " + super.getName() + " 연봉: " + super.getSalary() + " 부서: "+clas);
	    }
	
	
}

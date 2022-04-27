package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] tol = new User[3];
		
		User gus1 = new Customer("jws","j1234","정우성", 1000);
		User gus2 = new Customer("yis","y2345","이효리", 2000);
		User po = new Employee("master","m7788","운영자", 5000000);
		
		tol[0] = gus1;
		tol[1] = gus2;
		tol[2] = po;
		
		for(int i=0; i<tol.length; i++) {
			tol[i].showInfo();
		}
		System.out.println("운영자의 월급은 5000000원 입니다.");

	}

}

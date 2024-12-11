package com.sist.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // 생성자와 getter와 setter를 한번에 처리 가능 
@AllArgsConstructor
public class Saown {
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private String regdate;
	private int pay;
	
	
	public Saown(int sabun, String name, String dept, String job, String regdate, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.regdate = regdate;
		this.pay = pay;
	}


	public int getSabun() {
		return sabun;
	}


	public void setSabun(int sabun) {
		this.sabun = sabun;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	public int getPay() {
		return pay;
	}


	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
	
	
}

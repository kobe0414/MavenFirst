package com.mavenTest.entity;

public class User {
	private String username;
	
	private String password;
	
	private int sex;
	
	private int age;
	
	private String introduce;
	
	private int degree;
	
	

	public User() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", sex=" + sex + ", age=" + age
				+ ", introduce=" + introduce + ", degree=" + degree + "]";
	}
	
	

}

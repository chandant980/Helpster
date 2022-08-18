package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String name;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate joinDate;
	private boolean Permanent;
	private String role;
	
	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + eid + ", name=" + name + ", email=" + email + ", joinDate=" + joinDate
				+ ", isPermanent=" + Permanent + ", role=" + role + "]";
	}

	

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public boolean isPermanent() {
		return Permanent;
	}

	public void setPermanent(boolean Permanent) {
		this.Permanent = Permanent;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}

package com.megha.onetoone;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	@Entity
	@Table(name="ID_num")
public class ID {
	@Id
	@Column(name="Student_id")
	private int Id;
	private int id_num;
	public int getAdhaarNum() {
	return id_num;
	}
	public void setAdhaarNum(int id_num) {
	this.id_num = id_num;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
	this.Id = Id;
	}
	public ID(int Id) {
	super();
	this.Id=Id;
	}
	}

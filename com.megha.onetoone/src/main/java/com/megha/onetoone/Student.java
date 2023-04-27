package com.megha.onetoone;
import jakarta.persistence.*;
@Entity
@Table(name="Student_name")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="per_id")
	private int Id;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Student_id")
	private ID id;
	public int getId() {
	return Id;
	}
	public void setId(int Id) {
	this.Id = Id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	
	public ID getID() {
	return id;
	}
	public void setID(ID id) {
	this.id = id;
	}
	public Student(String name) {
	super();
	this.name = name;
	}
	}

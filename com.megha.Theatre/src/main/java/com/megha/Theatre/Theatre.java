package com.megha.Theatre;
import jakarta.persistence.*;
@Entity
@Table(name="theatre_inform")
public class Theatre {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="theatre_id")
	private int theatre_id;
	private String Movie_Name;
	public int getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(int theatre_id) {
		this.theatre_id = theatre_id;
	}
	public String getMovie_Name() {
		return Movie_Name;
	}
	public void setMovie_Name(String movie_Name) {
		Movie_Name = movie_Name;
	}
	public Theatre(int theatre_id, String Movie_Name) {
		super();
		this.theatre_id =theatre_id;
		this.Movie_Name = Movie_Name;
		}
	@Override
	public String toString() {
	return "Book [theatre_id=" + theatre_id + ", Movie_Name=" + Movie_Name + "]";
	}


}

package com.megha.hiber.onetomany;
import java.util.Set;
import jakarta.persistence.*;
  @Entity
  @Table(name="cart_infor")
public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="cart_id")
private int id;
private String name;
private double total;
@OneToMany(mappedBy="cart")
private Set<Items> items;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public double getTotal() {
return total;
}
public void setTotal(double total) {
this.total = total;
}
public Set<Items> getItems() {
return items;
}
public void setItems(Set<Items> items) {
this.items = items;
}
}


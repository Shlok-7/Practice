//entity class -> all Pojo classes the data will be send from client to user
//Simple Java class
//No business logic
//Only fields + getters + setters

package com.shlok.demo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity    // Tells JPA: This class maps to a database table
@Table(name="book")
public class Books {
	@Id
	int id;
	
	String name;
	String Author;
	int cost;
	
	public Books() {}
	public Books(int id,String name,String Author,int cost) {
		this.id=id;
		this.name=name;
		this.Author=Author; 
		this.cost=cost;
	}
	
	
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", Author=" + Author + ", cost=" + cost + "]";
	}


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
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

}

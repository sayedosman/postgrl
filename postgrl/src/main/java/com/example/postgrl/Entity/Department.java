package com.example.postgrl.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name = "department")
public class Department {

	private long id;
	private String name;
	private List<Employee>employees;
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	        public long getId() {
	        return id;
	    }
	public void setId(long id) {
		this.id = id;
	}
	 @Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(mappedBy="type",fetch = FetchType.EAGER,cascade ={CascadeType.MERGE})
	@Fetch(FetchMode.SUBSELECT)
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}

package ml.work.main.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "main_person")
public class Person {

	@Id
	@Column(name = "person_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "person_name")
	private String name;
	
	@Column(name = "person_surname")
	private String surname;
	
	@Column(name = "person_birthdate")
	private Date birthdate;
	
	@Column(name = "person_sex")
	private String sex;
	
	@Column(name = "person_province_id")
	private Province province;
	
	public Person() {
		
	}
	
	public Person(String name, String surname, Date birthdate, String sex, Province province) {
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.sex = sex;
		this.province = province;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}
	
}

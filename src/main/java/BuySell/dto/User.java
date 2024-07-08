package BuySell.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.type.TrueFalseType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	@Column(unique = true)
	private String email;
	private String gender;
	@Column(unique = true)
	private long phone;
	private String pwd;
	private String address;
	
	public User(String name, int age, String email, String gender, long phone, String pwd, String address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
		this.pwd = pwd;
		this.address = address;
	}

	public User(int id, String name, int age, String email, long phone, String pwd, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.pwd = pwd;
		this.address = address;
	}
}

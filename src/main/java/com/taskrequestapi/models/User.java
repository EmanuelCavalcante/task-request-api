package com.taskrequestapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_system")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private boolean active = true;

	@Column(name = "user_is_vip")
	private Boolean userIsVip = false;

	public User() {
		super();
	}

	public User(String email, String password, boolean active) {
		super();
		this.email = email;
		this.password = password;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isUserIsVip() {
		return userIsVip;
	}

	public void setUserIsVip(boolean userIsVip) {
		this.userIsVip = userIsVip;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", active=" + active + "]";
	}

}

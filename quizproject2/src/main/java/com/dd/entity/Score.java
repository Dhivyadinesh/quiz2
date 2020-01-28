package com.dd.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Score implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String user_name;
	private int score_q;
	private int score_e;
	
	@ManyToOne
	@JoinColumn
	private User user;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore_q() {
		return score_q;
	}

	public void setScore_q(int score_q) {
		this.score_q = score_q;
	}

	public int getScore_e() {
		return score_e;
	}

	public void setScore_e(int score_e) {
		this.score_e = score_e;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User getuser() {
		return user;
	}

	public void setuser(User user) {
		this.user = user;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
}

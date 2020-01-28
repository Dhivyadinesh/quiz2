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
public class Answer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String q_ans_text;
	private int q_ques_id;
	private String e_ans_text;
	private int e_ques_id;

	@ManyToOne
	@JoinColumn
	private User user;

	public User getuser() {
		return user;
	}

	public void setuser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQ_ans_text() {
		return q_ans_text;
	}

	public void setQ_ans_text(String q_ans_text) {
		this.q_ans_text = q_ans_text;
	}

	public int getQ_ques_id() {
		return q_ques_id;
	}

	public void setQ_ques_id(int q_ques_id) {
		this.q_ques_id = q_ques_id;
	}

	public String getE_ans_text() {
		return e_ans_text;
	}

	public void setE_ans_text(String e_ans_text) {
		this.e_ans_text = e_ans_text;
	}

	public int getE_ques_id() {
		return e_ques_id;
	}

	public void setE_ques_id(int e_ques_id) {
		this.e_ques_id = e_ques_id;
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

	
		
}

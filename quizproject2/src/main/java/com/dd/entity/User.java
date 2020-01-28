package com.dd.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String uname;
	private String passwd;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Score> score;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Answer> answer;

	
	public Set<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(Set<Answer> answer) {
		this.answer = answer;
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

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Set<Score> getFriend() {
		return score;
	}

	public void setFriend(Set<Score> score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", uname=" + uname + ", passwd=" + passwd + ", score=" + score
				+ ", answer=" + answer + "]";
	}
	
	
}

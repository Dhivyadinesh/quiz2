package com.dd.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Electric implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String text;
	private String opt_1;
	private String opt_2;
	private String opt_3;
	private String opt_4;
	private String type;
	
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String gettext() {
		return text;
	}

	public void settext(String text) {
		this.text = text;
	}

	public String getOpt_1() {
		return opt_1;
	}

	public void setOpt_1(String opt_1) {
		this.opt_1 = opt_1;
	}

	public String getOpt_2() {
		return opt_2;
	}

	public void setOpt_2(String opt_2) {
		this.opt_2 = opt_2;
	}

	public String getOpt_3() {
		return opt_3;
	}

	public void setOpt_3(String opt_3) {
		this.opt_3 = opt_3;
	}

	public String getOpt_4() {
		return opt_4;
	}

	public void setOpt_4(String opt_4) {
		this.opt_4 = opt_4;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
}

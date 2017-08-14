package com.basiclands.DataBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="language")
public class LanguageBean {

	@Getter @Setter
	@Id
	@Column(name="code")
	private String code = null;
	
	@Getter @Setter
	@Column(name="name")
	private String name = null;
	
	@Getter @Setter
	@Column(name="flag")
	private String flag = null;
	
}

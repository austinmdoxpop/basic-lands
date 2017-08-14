package com.basiclands.DataBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="set_language")
public class SetLanguageBean {

	@Getter @Setter
	@Id
	@GeneratedValue(generator="set_language_key_seq", strategy=GenerationType.SEQUENCE)
	@Column(name="key")
	private String key;
	
	@Getter @Setter
	@Column(name="set")
	private String set = null;
	
	@Getter @Setter
	@Column(name="language")
	private String language = null;
	
}

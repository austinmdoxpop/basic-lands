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
@Table(name="card_language")
public class CardLanguageBean {

	@Getter @Setter
	@Id
	@GeneratedValue(generator="card_language_key_seq", strategy=GenerationType.SEQUENCE)
	@Column(name="key")
	private String key;
	
	@Getter @Setter
	@Column(name="land")
	private String land = null;
	
	@Getter @Setter
	@Column(name="language")
	private String language = null;
	
}

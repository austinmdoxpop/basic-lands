package com.basiclands.DataBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="basic_land_type")
public class BasicLandTypeBean {

	@Getter @Setter
	@Id
	@Column(name="type")
	private String type = null;
	
	@Getter @Setter
	@Column(name="mana_abbreviation")
	private String manaAbbreviation = null;
	
	@Getter @Setter
	@Column(name="mana_color")
	private String manaColor = null;
	
	@Getter @Setter
	@Column(name="mana_symbol")
	private String manaSymbol = null;
	
}

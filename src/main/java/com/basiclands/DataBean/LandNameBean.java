package com.basiclands.DataBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="land_name")
public class LandNameBean {

	@Getter @Setter
	@Id
	@Column(name="key")
	private String key = null;
	
	@Getter @Setter
	@Column(name="name")
	private String name = null;
	
	@Getter @Setter
	@Column(name="english_pronunciation")
	private String englishPronunciation = null;
	
	@Getter @Setter
	@Column(name="basic_land_type")
	private String basicLandType = null;
	
	@Getter @Setter
	@Column(name="language")
	private String language = null;
	
	@Getter @Setter
	@Column(name="is_snow")
	private Boolean isSnow = null;
	
}

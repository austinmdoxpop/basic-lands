package com.basiclands.DataBean;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="land")
public class LandBean {
	
	@Getter @Setter
	@Id
	@Column(name="key")
	private String key = null;

	@Getter @Setter
	@Column(name="set")
	private String set = null;
	
	@Getter @Setter
	@Column(name="collector_number")
	private String collectorNumber = null;
	
	@Getter @Setter
	@Column(name="collector_number_modifier")
	private String collectorNumberModifier = null;

	@Getter @Setter
	@Column(name="basic_land_type")
	private String basicLandType = null;
	
	@Getter @Setter
	@Column(name="artist")
	private String artist = null;
	
	@Getter @Setter
	@Column(name="is_snow")
	private Boolean isSnow = null;

}

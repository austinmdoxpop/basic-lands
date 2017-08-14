package com.basiclands.DataBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="land_property_type")
public class LandPropertyTypeBean {

	@Getter @Setter
	@Id
	@Column(name="code")
	private String code = null;
	
	@Getter @Setter
	@Column(name="description")
	private String description = null;
	
}

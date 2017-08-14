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
@Table(name="land_property")
public class LandPropertyBean {

	@Getter @Setter
	@Id
	@GeneratedValue(generator="land_property_key_seq", strategy=GenerationType.SEQUENCE)
	@Column(name="key")
	private String key;
	
	@Getter @Setter
	@Column(name="land")
	private String land = null;
	
	@Getter @Setter
	@Column(name="property")
	private String value = null;
	
}

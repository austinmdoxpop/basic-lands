package com.basiclands.DataBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="land_image")
public class LandImageBean {

	@Getter @Setter
	@Id
	@Column(name="key")
	private String key = null;
	
	@Getter @Setter
	@Column(name="land")
	private String land = null;
	
	@Getter @Setter
	@Column(name="language")
	private String language = null;
	
	@Getter @Setter
	@Column(name="border_color")
	private String borderColor = null;
	
	@Getter @Setter
	@Column(name="image_l_location")
	private String imageLLocation = null;
	
	@Getter @Setter
	@Column(name="image_m_location")
	private String imageMLocation = null;
	
	@Getter @Setter
	@Column(name="image_s_location")
	private String imageSLocation = null;
	
}

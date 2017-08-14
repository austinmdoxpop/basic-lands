package com.basiclands.DataBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="land_template")
public class LandTemplateBean {

	@Getter @Setter
	@Id
	@Column(name="code")
	private String code = null;
	
	@Getter @Setter
	@Column(name="name")
	private String name = null;
	
	@Getter @Setter
	@Column(name="description")
	private String description = null;
	
	@Getter @Setter
	@Column(name="land_template_type")
	private String landTemplateType = null;
	
}

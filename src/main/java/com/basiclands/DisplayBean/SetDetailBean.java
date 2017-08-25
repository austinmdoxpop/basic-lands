package com.basiclands.DisplayBean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name="set")
public class SetDetailBean {

	@Getter @Setter
	@Column(name="code")
	private String code = null;
	
	@Getter @Setter
	@Column(name="name")
	private String name = null;
	
	@Getter @Setter
	@Column(name="block")
	private String block = null;
	
	@Getter @Setter
	@Column(name="can_be_foil")
	private Boolean canBeFoil = null;
	
	@Getter @Setter
	@Column(name="can_be_nonfoil")
	private Boolean canBeNonfoil = null;
	
	@Getter @Setter
	@Column(name="template")
	private String template = null;
	
	@Getter @Setter
	@Column(name="border")
	private String border = null;
	
	@Getter @Setter
	@Column(name="release_date")
	private Date releaseDate = null;

	@Getter @Setter
	@Column(table="set_type", name="name")
	private String setTypeName = null;
	
	@Getter @Setter
	@Column(table="set_type", name="description")
	private String setTypeDescription = null;
	
	@Getter @Setter
	@Column(table="set_type_category", name="name")
	private String setTypeCategoryName = null;
	
	@Getter @Setter
	@Column(table="set_type_category", name="description")
	private String setTypeCategoryDescription = null;
	
}

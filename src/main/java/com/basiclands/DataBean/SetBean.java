package com.basiclands.DataBean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="set")
public class SetBean {

	@Getter @Setter
	@Id
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
	@Column(name="set_type")
	private String setType = null;
	
}

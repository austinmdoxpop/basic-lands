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
@Table(name="land_group")
public class LandGroupBean {

	@Getter @Setter
	@Id
	@GeneratedValue(generator="land_group_key_seq", strategy=GenerationType.SEQUENCE)
	@Column(name="key")
	private String key;
	
	@Getter @Setter
	@Column(name="description")
	private String description = null;
	
	@Getter @Setter
	@Column(name="type")
	private String type = null;
	
	@Getter @Setter
	@Column(name="set")
	private String set = null;
	
	@Getter @Setter
	@Column(name="members")
	private Integer members = null;
	
	@Getter @Setter
	@Column(name="is_visual")
	private Boolean isVisual = null;
	
}

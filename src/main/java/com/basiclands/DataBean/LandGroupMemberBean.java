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
@Table(name="land_group_member")
public class LandGroupMemberBean {

	@Getter @Setter
	@Id
	@GeneratedValue(generator="land_group_member_key_seq", strategy=GenerationType.SEQUENCE)
	@Column(name="key")
	private String key;
	
	@Getter @Setter
	@Column(name="group")
	private String group = null;
	
	@Getter @Setter
	@Column(name="land")
	private String land = null;
	
	@Getter @Setter
	@Column(name="position")
	private Integer position = null;
	
}

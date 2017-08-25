package com.basiclands.DisplayBean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;

import com.basiclands.DataBean.BasicLandTypeBean;
import com.basiclands.DataBean.CardBorderBean;

import lombok.Getter;
import lombok.Setter;

@Table(name="land")
public class LandDetailBean {
	
	@Getter @Setter
	@Column(name="key")
	private String key = null;

	@Getter @Setter
	@Column(name="collector_number")
	private String collectorNumber = null;

	@Getter @Setter
	@Column(name="collector_number_modifier")
	private String collectorNumberModifier = null;

	@Getter @Setter
	@Column(name="is_snow")
	private String isSnow = null;

	@Getter @Setter
	@Column(name="artist")
	private String artist = null;

	@Getter @Setter
	private Boolean canBeFoil = null;

	@Getter @Setter
	private Boolean canBeNonfoil = null;

	@Getter @Setter
	private BasicLandTypeBean type = null;

	@Getter @Setter
	private SetDetailBean set = null;

	@Getter @Setter
	private TemplateDetailBean template = null;

	@Getter @Setter
	private CardBorderBean border = null;

	@Getter @Setter
	private List<GroupDetailBean> groups = null;

	@Getter @Setter
	private List<RelatedLandBean> variants = null;

	@Getter @Setter
	private String location = null;

	@Getter @Setter
	private String availabilityNotes = null;

	@Getter @Setter
	private List<String> tags = null;

	@Getter @Setter
	private List<String> notes = null;

}

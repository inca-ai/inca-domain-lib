package com.inca.domain.model;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(schema = "inca")
@ToString(callSuper=true, includeFieldNames=true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class VideoInformationObject extends InformationObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<SpokenText> spokenTexts;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<DetectedObject> detectedObjects;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DetectedText> detectedTexts;
	
	@Column
	private int width;
	
	@Column
	private int height;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Topic> topics;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<NamedEntity> entities;
	
	@Column
	private int duration;
	
	@Lob
	private String text;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<TableData> tables;

	public List<Speaker> getAllSpeakers() {
		return spokenTexts.stream().map(x -> x.getSpeaker()).collect(Collectors.toList());
	}
}

package com.inca.domain.model;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(schema = "inca")
@ToString(callSuper=true, includeFieldNames=true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VideoInformationObject extends InformationObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany
	private List<SpokenText> spokenTexts;
	
	@ManyToMany
	private List<DetectedObject> detectedObjects;
	
	@OneToMany
	private List<DetectedText> detectedTexts;
	
	@Column
	private int width;
	
	@Column
	private int height;

	public int getDuration() {
		return spokenTexts.stream().map(x -> x.getDuration()).reduce(0, Integer::sum);
	}
	
	public String getFullText() {
		return spokenTexts.stream().map(x -> x.getText()).collect(Collectors.joining(" "));
	}
	
	public List<Speaker> getAllSpeakers() {
		return spokenTexts.stream().map(x -> x.getSpeaker()).collect(Collectors.toList());
	}
}

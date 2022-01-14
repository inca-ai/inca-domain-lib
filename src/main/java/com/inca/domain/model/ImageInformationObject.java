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
public class ImageInformationObject extends InformationObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToMany
	private List<DetectedObject> detectedObjects;
	
	@OneToMany
	private List<DetectedText> detectedTexts;
	
	@Column
	private String generatedCaption;
	
	@Column
	private int width;
	
	@Column
	private int height;
	
	@ManyToMany
	private List<Topic> topics;
	
	@ManyToMany
	private List<NamedEntity> entities;
	
	public String getFullText() {
		return detectedTexts.stream().map(x -> x.getText()).collect(Collectors.joining(" "));
	}
	
}

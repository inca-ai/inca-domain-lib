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
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class AudioInformationObject extends InformationObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<SpokenText> spokenTexts; 
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Topic> topics;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<NamedEntity> entities;
	
	@Lob
	private String text;
	
	@Column
	private int duration;
		
	public List<Speaker> getAllSpeakers() {
		return spokenTexts.stream().map(x -> x.getSpeaker()).collect(Collectors.toList());
	}
}
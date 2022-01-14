package com.inca.domain.model;

import java.util.List;

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
public class DocumentInformationObject extends InformationObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Lob
	private String text;
	
	@Lob
	private String translatedText;
	
	@ManyToMany
	private List<String> topics;
	
	@ManyToMany
	private List<String> entities;	
}

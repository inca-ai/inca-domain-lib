package com.inca.domain.model;

import java.util.List;
import java.util.Locale;

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
public class DocumentInformationObject extends InformationObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Lob
	private String text;
	
	@Lob
	private String translatedText;
	
	@Column
	private Locale language;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Topic> topics;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<NamedEntity> entities;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<TableData> tables;
}

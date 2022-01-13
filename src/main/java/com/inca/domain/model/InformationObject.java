package com.inca.domain.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(schema = "inca")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InformationObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="file_id")
	private FileInformation file;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private InformationObjectType type;
	
	@Column
	private String data;
	
	@Column
	private Date creationDate;
	
	@Column
	private Date expirationDate;
	
	@Lob
	private String thumbnail;
	
	@Embedded
	private List<Coordinate> coordinates;
	
	@ManyToMany
	private List<Tag> tags;
	
	@ElementCollection
	private List<Integer> accessGroups;
	
	@ElementCollection
	private List<Integer> accessUsers;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<InformationObject> subInformationObjects;
}
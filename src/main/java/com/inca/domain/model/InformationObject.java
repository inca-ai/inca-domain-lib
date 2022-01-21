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
import javax.persistence.Index;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.history.Revisions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(schema = "inca", indexes = {@Index(name="fileIdx", columnList = "file_id" )})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
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
	
	@ManyToMany(cascade = CascadeType.MERGE)
	private List<Tag> tags;
	
	@ElementCollection
	private List<Long> accessGroups;
	
	@ElementCollection
	private List<Long> accessUsers;
	
	@ElementCollection(targetClass = Revisions.class)
	private List<Revision> revisions;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<InformationObject> subInformationObjects;
	
}
package com.inca.domain.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "inca")
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
	private InformationObjectType type;
	
	@Column
	private String data;
	
	@ElementCollection
	private List<Integer> assignedGroups;
	
	@ElementCollection
	private List<Integer> accessGroups;
	
	@ElementCollection
	private List<Integer> accessUsers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public FileInformation getFile() {
		return file;
	}

	public void setFile(FileInformation file) {
		this.file = file;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public InformationObjectType getType() {
		return type;
	}

	public void setType(InformationObjectType type) {
		this.type = type;
	}

	public List<Integer> getAssignedGroups() {
		return assignedGroups;
	}

	public void setAssignedGroups(List<Integer> assignedGroups) {
		this.assignedGroups = assignedGroups;
	}

	public List<Integer> getAccessGroups() {
		return accessGroups;
	}

	public void setAccessGroups(List<Integer> accessGroups) {
		this.accessGroups = accessGroups;
	}

	public List<Integer> getAccessUsers() {
		return accessUsers;
	}

	public void setAccessUsers(List<Integer> accessUsers) {
		this.accessUsers = accessUsers;
	}

	public InformationObject() {
		super();
	}
}
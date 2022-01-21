package com.inca.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(indexes = { @Index(name = "FILE_MD5_INDEX", columnList = "md5", unique = true) }, schema = "inca")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;

	@Column
	private String md5;

	@Column
	private Date creationDate;

	@Column
	private Date expirationDate;

	@Column
	private Long author;

	@Column
	private String folder;

	@Column
	private Long fileSize;

	@Column
	private String contentType;

	private String downloadUrl;

}

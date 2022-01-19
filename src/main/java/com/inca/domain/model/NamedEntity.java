package com.inca.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class NamedEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String entity;
	
	@Column
	private NamedEntityType type;

}

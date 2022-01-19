package com.inca.domain.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
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
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetectedObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private int startTime;
	
	@Embedded
	private Rectangle boundingBox;
	
	@Column
	private int count;
}

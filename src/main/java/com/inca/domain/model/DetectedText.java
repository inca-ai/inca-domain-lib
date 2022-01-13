package com.inca.domain.model;

import java.awt.Polygon;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
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
public class DetectedText {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String text;
	
	@Column
	String translatedText;
	
	@Column
	private String language; // Locale.getISOLanguages
	
	@Column
	private String author;
	
	@Column
	private int startTime;
	
	@Embedded
	private Polygon boundingBox;
}

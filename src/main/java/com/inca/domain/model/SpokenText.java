package com.inca.domain.model;

import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
public class SpokenText {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String text;
	
	@Column
	private String translatedText;
	
	@Column
	private Locale language;
	
	@OneToOne
	private Speaker speaker;
	
	@Column
	private int start;
	
	@Column
	private int duration;
}

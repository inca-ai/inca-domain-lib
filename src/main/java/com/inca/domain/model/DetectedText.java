package com.inca.domain.model;

import java.util.Locale;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetectedText {
	private String text;
	String translatedText;
	private Locale language; // Locale.getISOLanguages
	private String author;
	private int startTime;
	private Rectangle boundingBox;
}

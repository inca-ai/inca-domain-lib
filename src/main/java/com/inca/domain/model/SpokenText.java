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
public class SpokenText {
	private String text;
	private String translatedText;
	private Locale language;
	private Speaker speaker;
	private int start;
	private int duration;
}

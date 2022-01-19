package com.inca.domain.model;

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
public class Rectangle {
	private int topLeftX;
	private int topLeftY;
	private int bottomRightX;
	private int bottomRightY;
}

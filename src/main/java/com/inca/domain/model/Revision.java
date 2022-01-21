package com.inca.domain.model;

import java.util.Date;
import java.util.List;

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
public class Revision {
	private User user;
	private Date date;
	private String comment;
	private List<User> approvedByUsers;
}

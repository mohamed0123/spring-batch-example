package com.springbatch.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;
	private Date lastCheckDate = new Date();
}

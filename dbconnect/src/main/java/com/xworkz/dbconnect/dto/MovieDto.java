package com.xworkz.dbconnect.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "movie_table")
public class MovieDto {
	
@Id
@Column(name="m_id")
private int id;
@Column(name="m_name")
private String name;
@Column(name="m_hero")
private String hero;
@Column(name="m_heroien")
private String heroien;
@Column(name="m_budget")
private double budget;
@Column(name="m_collection")
private double collection;
@Column(name="m_producer")
private String producer;

}


package com.game.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class PlayerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	@Column(name = "full_name")
	private String fullName;

	@Column(name = "position")
	private String position;

	@Column(name = "age")
	private Integer age;

	@ManyToOne
	@JoinColumn(name = "team_id")
	private TeamEntity team;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public TeamEntity getTeam() {
		return team;
	}

	public void setTeam(TeamEntity team) {
		this.team = team;
	}
	
	
}

package com.game.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "club_team")
public class TeamEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "country")
	private String country;

	@Column(name = "manager")
	private String manager;

	@Column(name = "logo")
	private String logo;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	@OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
	private List<PlayerEntity> players;
	
	@OneToMany(mappedBy = "homeTeam")
	private List<MatchEntity> homeTeam;
	
	@OneToMany(mappedBy = "awayTeam")
	private List<MatchEntity> awayTeam;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<PlayerEntity> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerEntity> players) {
		this.players = players;
	}

}

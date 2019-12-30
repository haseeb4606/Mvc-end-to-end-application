package com.game.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "matches")
public class MatchEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "match_date")
	private Date matchDate;
	@Column(name = "match_location")
	private String location;

	@ManyToOne
	@JoinColumn(name = "home_team_id")
	private TeamEntity homeTeam;

	@ManyToOne
	@JoinColumn(name = "away_team_id")
	private TeamEntity awayTeam;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public TeamEntity getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(TeamEntity homeTeam) {
		this.homeTeam = homeTeam;
	}

	public TeamEntity getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(TeamEntity awayTeam) {
		this.awayTeam = awayTeam;
	}

}

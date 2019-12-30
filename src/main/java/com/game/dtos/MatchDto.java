package com.game.dtos;

import java.util.Date;

public class MatchDto {

	private long id;

	private Date matchDate;

	private String location;
	
	private long awayTeam;
	
	private long homeTeam;

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

	public long getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(long awayTeam) {
		this.awayTeam = awayTeam;
	}

	public long getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(long homeTeam) {
		this.homeTeam = homeTeam;
	}

	@Override
	public String toString() {
		return "MatchDto [id=" + id + ", matchDate=" + matchDate + ", location=" + location + ", awayTeam=" + awayTeam
				+ ", homeTeam=" + homeTeam + "]";
	}
	
	

	

}

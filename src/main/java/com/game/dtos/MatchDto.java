package com.game.dtos;

import java.util.Date;

public class MatchDto {

	private long id;

	private String matchDate;

	private String location;

	private long awayTeamId;

	private long homeTeamId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getAwayTeamId() {
		return awayTeamId;
	}

	public void setAwayTeamId(long awayTeamId) {
		this.awayTeamId = awayTeamId;
	}

	public long getHomeTeamId() {
		return homeTeamId;
	}

	public void setHomeTeamId(long homeTeamId) {
		this.homeTeamId = homeTeamId;
	}

	@Override
	public String toString() {
		return "MatchDto [id=" + id + ", matchDate=" + matchDate + ", location=" + location + ", awayTeamId="
				+ awayTeamId + ", homeTeamId=" + homeTeamId + "]";
	}

}

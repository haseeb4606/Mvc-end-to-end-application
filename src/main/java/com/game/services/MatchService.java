package com.game.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.game.dtos.MatchDto;
import com.game.entities.MatchEntity;
import com.game.entities.TeamEntity;
import com.game.repositories.MatchRepository;
import com.game.repositories.TeamRepository;

@Service
public class MatchService {

	@Autowired
	private TeamRepository teamRepository;

	@Autowired
	private MatchRepository matcheRepository;

	public MatchDto convertEntity(MatchEntity match) {

		MatchDto dto = null;

		if (match != null) {
			dto = new MatchDto();

			dto.setId(match.getId());
			dto.setLocation(match.getLocation());
			dto.setMatchDate(match.getMatchDate());

		}

		return dto;
	}

	public MatchEntity convertDto(MatchDto dto) {

		MatchEntity match = null;

		if (dto != null) {

			match = new MatchEntity();

			match.setId(dto.getId());
			match.setLocation(dto.getLocation());
			match.setMatchDate(dto.getMatchDate());

		}

		return match;
	}

	public void createMatch(MatchDto dto) {

		TeamEntity homeTeamId = teamRepository.getById(dto.getHomeTeamId());

		TeamEntity awayTeamId = teamRepository.getById(dto.getAwayTeamId());

		MatchEntity match = convertDto(dto);

		match.setHomeTeamId(homeTeamId);
		match.setAwayTeamId(awayTeamId);
		matcheRepository.saveMatche(match);
	}
}

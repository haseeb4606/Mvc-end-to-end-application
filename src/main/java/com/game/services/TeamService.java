package com.game.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.converters.Converters;
import com.game.dtos.PlayerDto;
import com.game.dtos.TeamDto;
import com.game.entities.PlayerEntity;
import com.game.entities.TeamEntity;
import com.game.repositories.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;

	public TeamDto createTeam(TeamDto dto) {

		TeamEntity team = new TeamEntity();

		team.setName(dto.getName());
		team.setManager(dto.getManager());
		team.setCountry(dto.getCountry());
		team.setUpdatedAt(new Date());
		team.setCreatedAt(new Date());

		return convertData(teamRepository.saveData(team));

	}

	public TeamDto getTeamById(long id) {

		TeamEntity team = teamRepository.getById(id);

		TeamDto dto = convertData(team);

		return dto;
	}

	public List<TeamDto> getAllDatat() {

		List<TeamEntity> team = teamRepository.getAllData();

		List<TeamDto> returnList = new ArrayList<TeamDto>();

		for (TeamEntity t : team) {

			TeamDto d = convertData(t);

			returnList.add(d);

		}

		return returnList;
	}

	private TeamDto convertData(TeamEntity team) {

		TeamDto dto = null;

		if (team != null) {

			dto = new TeamDto();

			dto.setId(team.getId());
			dto.setName(team.getName());
			dto.setCountry(team.getCountry());
			dto.setManager(team.getManager());
			dto.setLogo(team.getLogo());

			List<PlayerDto> playerdto = new ArrayList<PlayerDto>();
			for (PlayerEntity pl : team.getPlayers()) {

				PlayerDto pd = Converters.convert(pl);
				playerdto.add(pd);

			}

			dto.setPlayers(playerdto);
		}

		return dto;

	}

}

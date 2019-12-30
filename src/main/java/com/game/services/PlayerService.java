package com.game.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.converters.Converters;
import com.game.dtos.PlayerDto;
import com.game.entities.PlayerEntity;
import com.game.entities.TeamEntity;
import com.game.repositories.PlayerRepository;
import com.game.repositories.TeamRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private TeamRepository teamRepository;

	public void createTeamPlayer(Long TeamId, PlayerDto dto) throws Exception {

		TeamEntity team = teamRepository.getyById(TeamId);

		
		if (team == null) {

			throw new Exception("Sorry this team doesn't exist" + TeamId);

		} else {
			PlayerEntity player = Converters.convert(dto);

			player.setTeam(team);
			if (player != null) {

				playerRepository.savePlayers(player);
			}

		}
	}

	

}

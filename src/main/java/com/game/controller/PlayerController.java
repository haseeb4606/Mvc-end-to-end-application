package com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.dtos.PlayerDto;
import com.game.dtos.TeamDto;
import com.game.services.PlayerService;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {
	
	@Autowired
	private PlayerService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createPlayer(@RequestParam(value = "teamId")long TeamId, @RequestBody PlayerDto playerDto)
	throws Exception {
		
		service.createTeamPlayer(TeamId, playerDto);
		
		
	}
	
}

package com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.dtos.MatchDto;
import com.game.services.MatchService;

@RestController
@RequestMapping(value="/match")
public class MatchController {

	@Autowired
	private MatchService service;
	
	@RequestMapping (value="id", method = RequestMethod.POST)
	public void creatMatch(@RequestParam long id,@RequestBody MatchDto dto) {
		
		service.createMatch(id, dto);
	}
	
	
}

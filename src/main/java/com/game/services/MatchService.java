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
	

	public MatchEntity convertDto(MatchDto dto) {
		
		MatchEntity ma = null;
				
		if(dto!=null) {
			ma = new MatchEntity();
		
		ma.setId(dto.getId());
		ma.setLocation(dto.getLocation());
		ma.setMatchDate(dto.getMatchDate());
		
	
		}
		
		return ma;
	}

	public MatchDto convertEntity(MatchEntity match) {
		
		MatchDto dto = null;
		
		if (match!=null) {
			
			dto = new MatchDto();
			
			dto.setId(match.getId());
			dto.setLocation(match.getLocation());
			dto.setMatchDate(match.getMatchDate());
			
		}
		
		return dto;
	}
	
	
	public void createMatch(long id, MatchDto dto) {
		
		
		TeamEntity team = teamRepository.getById(id);
		
		if(team==null) {
			
			System.out.println("sorry no team found");
		}else {
			
			MatchEntity match = convertDto(dto);
			
			match.setAwayTeam(team);
			match.setHomeTeam(team);
			
			matcheRepository.saveMatche(match);
		}
	}
	
	
}














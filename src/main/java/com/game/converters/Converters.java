package com.game.converters;

import com.game.dtos.PlayerDto;
import com.game.entities.PlayerEntity;

public class Converters {
	
	public static PlayerEntity convert(PlayerDto dto) {

		PlayerEntity player = null;

		if (dto != null) {

			player = new PlayerEntity();

			player.setFullName(dto.getFullName());
			player.setPosition(dto.getPosition());
			player.setAge(dto.getAge());
		}

		return player;
	}

	
	public static PlayerDto convert(PlayerEntity player) {
		
		PlayerDto dto = null;
		if(player != null) {
			dto = new PlayerDto();
			
			dto.setId(player.getId());
			dto.setFullName(player.getFullName());
			dto.setAge(player.getAge());
			dto.setPosition(player.getPosition());
		
		}
		 return dto;
		
	}		
	
}

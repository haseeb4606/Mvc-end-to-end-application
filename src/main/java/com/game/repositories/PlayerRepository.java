package com.game.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.game.entities.PlayerEntity;
@Repository
@Transactional
public class PlayerRepository {
	
	private EntityManager manager;
	
	public PlayerEntity savePlayers(PlayerEntity player) {
		
		return manager.merge(player);
	}
	
	public EntityManager getManager() {
		return manager;
	}

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	

}

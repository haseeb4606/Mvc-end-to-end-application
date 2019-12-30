package com.game.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.game.entities.MatchEntity;

@Repository
@Transactional
public class MatchRepository {

	private EntityManager manager;

	public MatchEntity saveMatche(MatchEntity matches) {

		return manager.merge(matches);

	}

	public EntityManager getManager() {
		return manager;
	}

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	
}

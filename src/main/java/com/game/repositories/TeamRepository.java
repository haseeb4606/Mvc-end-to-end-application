package com.game.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.game.entities.TeamEntity;

@Repository
@Transactional
public class TeamRepository {

	private EntityManager manager;

	public TeamEntity saveData(TeamEntity team) {

		manager.persist(team);

		return manager.merge(team);
	}

	public TeamEntity getyById(long id) {

		TeamEntity team = manager.find(TeamEntity.class, id);

		return team;

	}

	public TeamEntity getByCountry(String country) {

		Query q = manager.createQuery("select t from EntityTeam where t.country =:country");
		q.setParameter("country", country);

		return (TeamEntity) q.getSingleResult();

	}

	public List<TeamEntity> getAllData() {

		Query q = manager.createQuery("from TeamEntity");

		return q.getResultList();
	}

	public TeamEntity getById(long id) {

		return manager.find(TeamEntity.class, id);
	}

	public EntityManager getManager() {
		return manager;
	}

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

}

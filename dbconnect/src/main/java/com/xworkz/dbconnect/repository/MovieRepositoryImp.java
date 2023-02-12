package com.xworkz.dbconnect.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dbconnect.dto.MovieDto;
@Repository
public class MovieRepositoryImp  implements MovieRepository{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public MovieRepositoryImp() {
		System.out.println("running Movie RepositoryImp...................");
	}

	@Override
	public boolean save(MovieDto dto) {
		System.out.println("Running movie in implimentation");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		entityManager.close();
		
		return false;
	}
	

}

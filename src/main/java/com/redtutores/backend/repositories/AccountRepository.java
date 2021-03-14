package com.redtutores.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.redtutores.backend.models.entities.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
	
}

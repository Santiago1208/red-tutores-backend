package com.redtutores.backend.services;

import com.redtutores.backend.rest.dto.AccountDTO;

public interface AccountService {

	void save(AccountDTO accountDTO) throws Exception;
	
}

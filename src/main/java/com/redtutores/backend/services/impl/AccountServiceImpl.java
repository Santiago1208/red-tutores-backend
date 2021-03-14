package com.redtutores.backend.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.redtutores.backend.models.entities.Account;
import com.redtutores.backend.repositories.AccountRepository;
import com.redtutores.backend.rest.dto.AccountDTO;
import com.redtutores.backend.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
    private ModelMapper modelMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void save(AccountDTO accountDTO) throws Exception {
		Account accountEntity = modelMapper.map(accountDTO, Account.class);
		
		accountRepository.save(accountEntity);
	}
	
}

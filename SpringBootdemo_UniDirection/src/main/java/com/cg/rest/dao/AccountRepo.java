package com.cg.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.rest.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {

}

package com.easyaccounting.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.easyaccounting.expense.model.ExpItemTbl;

@Repository
@Transactional
public interface ExpenseCategoryRepository extends JpaRepository<ExpItemTbl, Integer>{

}

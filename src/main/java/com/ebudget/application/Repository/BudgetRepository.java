package com.ebudget.application.Repository;

import com.ebudget.application.model.Budget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends CrudRepository<Budget, Long> {
}

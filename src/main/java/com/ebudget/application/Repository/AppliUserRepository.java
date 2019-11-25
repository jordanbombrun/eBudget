package com.ebudget.application.Repository;

import com.ebudget.application.model.AppliUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppliUserRepository extends CrudRepository<AppliUser, Long> {

}

package com.voy.service.dao;

import org.springframework.stereotype.Repository;
import com.voy.service.repo.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<EmployeeEntity, Integer>{

}

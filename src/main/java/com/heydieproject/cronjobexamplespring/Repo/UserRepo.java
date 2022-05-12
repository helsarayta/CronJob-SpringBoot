package com.heydieproject.cronjobexamplespring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<src.main.java.com.heydieproject.cronjobexamplespring.Entity.User, Integer> {

}

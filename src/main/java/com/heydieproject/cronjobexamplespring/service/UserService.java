package com.heydieproject.cronjobexamplespring.service;

import com.heydieproject.cronjobexamplespring.Repo.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import src.main.java.com.heydieproject.cronjobexamplespring.Entity.User;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class UserService {

    UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    Logger log = LoggerFactory.getLogger(UserService.class);

    @Scheduled(fixedRate = 5000)
    public src.main.java.com.heydieproject.cronjobexamplespring.Entity.User createUser() {
        src.main.java.com.heydieproject.cronjobexamplespring.Entity.User user1 = new src.main.java.com.heydieproject.cronjobexamplespring.Entity.User();
        user1.setUsername("User"+ new Random().nextInt(1234567));
        user1.setUserid("ID" + UUID.randomUUID());
        log.info("Service post ->> " + new Date().toString());
        return userRepo.save(user1);
    }

    @Scheduled(cron = "15 * * * * *")
    public List<src.main.java.com.heydieproject.cronjobexamplespring.Entity.User> findAll() {

        List<User> users = userRepo.findAll();
        log.info("Service GET -->>> " + new Date().toString());
        log.info("Total GET -->>> " + users.size());
        log.info("USER --->> {}", users );
        return users;
    }


}

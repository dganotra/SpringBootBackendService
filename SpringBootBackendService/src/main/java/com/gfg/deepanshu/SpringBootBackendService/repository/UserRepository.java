package com.gfg.deepanshu.SpringBootBackendService.repository;

import com.gfg.deepanshu.SpringBootBackendService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


}

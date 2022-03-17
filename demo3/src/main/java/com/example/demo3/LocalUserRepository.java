package com.example.demo3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalUserRepository extends JpaRepository<LocalUser, Integer> {

    /**
     * 
     * 根据名称获取用户
     * 
     * @param name
     * @return
     */
    LocalUser findOneByName(String name);

}

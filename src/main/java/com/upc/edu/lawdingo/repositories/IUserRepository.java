package com.upc.edu.lawdingo.repositories;

import com.upc.edu.lawdingo.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository <Users,Integer> {


}

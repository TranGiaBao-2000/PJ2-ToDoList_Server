package com.example.pj2todolist_server.repository;

import com.example.pj2todolist_server.entity.Connect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectRepo extends JpaRepository<Connect,Integer> {

}

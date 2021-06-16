package com.example.pj2todolist_server.controller;

import com.example.pj2todolist_server.entity.Connect;
import com.example.pj2todolist_server.repository.ConnectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ApiController {

    @Autowired
    ConnectRepo connectRepo;

    @GetMapping("/")
    public ResponseEntity<?> index(){
        List<Connect> list = connectRepo.findAll();
        return ResponseEntity.ok(list);
    }

}

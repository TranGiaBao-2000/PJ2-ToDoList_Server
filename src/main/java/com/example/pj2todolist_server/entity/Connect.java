package com.example.pj2todolist_server.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="test")
public class Connect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String statusName;
}

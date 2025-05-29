package com.example.app.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Query")
@NoArgsConstructor
@AllArgsConstructor
public class Final_Query {
    private String final_query;
}



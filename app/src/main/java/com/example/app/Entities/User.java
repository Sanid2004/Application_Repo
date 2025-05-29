package com.example.app.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "Users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String name;
    private String regNo;
    private String email;
}

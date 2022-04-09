package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    private String UserId;
    @Column(unique = true,length=20)
    private String username;
    private String password;
    @ManyToMany(mappedBy = "users",fetch= FetchType.EAGER)
    private List<Role> roles=new ArrayList<>();

}

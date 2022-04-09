package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20,unique = true  )
    private String roleName;
    private String des;
    @ManyToMany(fetch = FetchType.EAGER)
    //@JoinTable(name="USERS_ROLES")
    private List<Role> users=new ArrayList<>();
}

package com.gfg.deepanshu.SpringBootBackendService.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter@Setter
    public Long id;
    @Getter@Setter
    public String firstName;
    @Getter@Setter
    public String lastName;

}

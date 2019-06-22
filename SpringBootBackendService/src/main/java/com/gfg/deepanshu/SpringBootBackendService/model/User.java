package com.gfg.deepanshu.SpringBootBackendService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
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

    /*public static void main(String[] args) {
        User u= new User(10L, "deepanshu", "ganotra");
        System.out.println(u);
    }*/
}

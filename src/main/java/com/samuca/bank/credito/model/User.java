package com.samuca.bank.credito.model;

import jakarta.persistence.Table;

@Table(name = "td_user", schema = "message_generator")
public class User {

    private String name;
    private String lastName;
    private String login;
    private Integer age;
}

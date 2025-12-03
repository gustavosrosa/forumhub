package br.com.alura.forumweb.model;

import jakarta.persistence.Table;

@Table(name = "profiles")
public enum Profile {
    ADMIN,
    USER,
}

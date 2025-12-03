package br.com.alura.forumweb.model;

import jakarta.persistence.Table;

@Table(name = "category")
public enum Category {
	
	PRESENTIAL,
	HOMEOFFICE,
	SEMIPRESENTIAL

}

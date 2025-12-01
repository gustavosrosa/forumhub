package br.com.alura.forumweb.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "topic")
@Entity
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(unique = true, length = 100, nullable = false)
	private String title;
	
	@Column(length = 255, nullable = true)
	private String message;
	
	@Column(nullable = false, name = "createdAt")
	private LocalDateTime created_at;
	
	@Column(nullable = false)
	private boolean status;
	
	@OneToMany 
	@JoinColumn(name = "author_id")
	private User author;
	
	@OneToMany
	@JoinColumn(name = "course_id")
	private Course course;
	
	@Column(nullable = false)
	private List<String> answers;
	

}

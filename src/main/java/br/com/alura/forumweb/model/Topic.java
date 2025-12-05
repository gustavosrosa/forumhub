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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
@Table(name = "topic")
@Getter
@Setter
@NoArgsConstructor
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, length = 100, nullable = false)
	private String title;
	
	@Column(length = 255, nullable = true, name = "message_topic")
	private String message;
	
	@Column(nullable = false, name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(nullable = false, name = "status_topic")
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private User author;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	@OneToMany
    @JoinColumn(name = "answer_id")
	private List<Answer> answers;

}

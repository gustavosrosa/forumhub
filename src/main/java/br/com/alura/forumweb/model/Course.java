package br.com.alura.forumweb.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "course")
@Getter
@Setter
@NoArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, length = 100, nullable = false)
	private String name;
	
	@Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
	private Category category;

}

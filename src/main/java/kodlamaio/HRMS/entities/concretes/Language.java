package kodlamaio.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "languages")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Language {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Id
	private int id;
	
	@NotNull
	@Column(name = "language_name")
	private String languageName;
	
	@NotNull
	@Size(min = 1,max = 5)
	@Column(name = "level")
	private int level;
	
	@ManyToOne
	@JoinColumn(name = "language")
	private Cv cv;
	;
}

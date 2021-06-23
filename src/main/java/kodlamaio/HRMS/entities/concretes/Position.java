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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitilazer","handler","jobtitles"})
@Table(name = "jobpositions")
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "position_id")
	private int id;
	
	@NotNull
	@Column(name = "name", unique = true)
	private String positionName;

	@OneToMany(mappedBy = "positionId")
	private List<JobTitle> jobtitles;
	
	@ManyToOne
	@JoinColumn(name = "position")
	private Cv cv;
	
	
	
	@OneToMany(mappedBy = "position")
	private List<PreviousJob> jobs;
}

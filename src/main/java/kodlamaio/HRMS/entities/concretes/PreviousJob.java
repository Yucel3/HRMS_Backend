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
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "previous_jobs")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class PreviousJob {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@NotNull
	@ManyToOne()
	@JoinColumn(name = "position_id")
	private Position position;
	
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "company_id")
	private Company company;
	
	@NotNull
	@Column(name = "start_year")
	private int startYear;

	@Column(name = "finish_year")
	private int finishYear;
	
	@ManyToOne
	@JoinColumn(name = "previousJob")
	private Cv cv;

}

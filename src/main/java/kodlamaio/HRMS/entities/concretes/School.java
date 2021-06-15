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

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schools")
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotNull
	@Column(name = "name")
	private String schoolName;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City cityId;
	
	@NotNull
	@Column(name = "start_year")
	private int StartYear;
	
	@Column(name = "finish_year")
	private int finishYear;
	
	@OneToMany(mappedBy = "schoolId")
	private List<Cv> cvs;

}

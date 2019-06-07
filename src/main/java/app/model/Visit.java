package app.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

	@Column(name = "visit_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Getter @Setter
	private LocalDate date;

	@NotEmpty
	@Column(name = "description")
	@Getter @Setter
	private String description;

	@Column(name = "pet_id")
	@Getter @Setter
	private Integer petId;

	public Visit() {
		this.date = LocalDate.now();
	}

}

package app.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public class Person extends BaseEntity {

	@Column(name = "first_name")
	@NotEmpty
	@Getter @Setter
	private String firstName;

	@Column(name = "last_name")
	@NotEmpty
	@Getter @Setter
	private String lastName;

}

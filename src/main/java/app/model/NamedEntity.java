package app.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public class NamedEntity extends BaseEntity {

	@Column(name = "name")
	@Getter @Setter
	private String name;

	@Override
	public String toString() {
		return this.getName();
	}

}

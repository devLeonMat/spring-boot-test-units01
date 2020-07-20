package biblioteca.biblio.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "AUTOR")
public class Autor {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "NACIONALIDAD")
	private String nacionalidad;
}

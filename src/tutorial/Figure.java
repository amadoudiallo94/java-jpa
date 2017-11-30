package tutorial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import java.io.Serializable;
import java.util.List;

@Entity
public class Figure implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long id;
	private int name;
	private int nombreCote;
	private int nombreSommet;
	private int nombreFace;
	@Transient
	private List<Point> pointRelations;
	
	public Figure() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getNombreCote() {
		return nombreCote;
	}

	public void setNombreCote(int nombreCote) {
		this.nombreCote = nombreCote;
	}

	public int getNombreSommet() {
		return nombreSommet;
	}

	public void setNombreSommet(int nombreSommet) {
		this.nombreSommet = nombreSommet;
	}

	public int getNombreFace() {
		return nombreFace;
	}

	public void setNombreFace(int nombreFace) {
		this.nombreFace = nombreFace;
	}

	public List<Point> getPointRelations() {
		return pointRelations;
	}

	public void setPointRelations(List<Point> pointRelations) {
		this.pointRelations = pointRelations;
	}
}

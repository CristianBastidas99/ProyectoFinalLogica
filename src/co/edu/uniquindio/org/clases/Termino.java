package co.edu.uniquindio.org.clases;

import java.util.Objects;

public class Termino {

	String nombre;
	TipoTermino tipoTermino;

	public Termino(String nombre) {
		super();
		this.nombre = nombre;
		this.tipoTermino = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoTermino getTipoTermino() {
		return tipoTermino;
	}

	public void setTipoTermino(TipoTermino tipoTermino) {
		this.tipoTermino = tipoTermino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Termino other = (Termino) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return nombre;
	}

}

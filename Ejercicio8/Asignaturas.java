package Ejercicio8;

public class Asignaturas{

	enum Curso{

		PRIMERO,
		SEGUNDO

	}

	private String nombreAsignatura;
	private int codigoAsignatura;
	private Curso cursoImpartido;

	//Método constructor
	public Asignaturas(String nombreAsignatura, int codigoAsignatura, Curso cursoImpartido){

		this.nombreAsignatura = nombreAsignatura;
		this.codigoAsignatura = codigoAsignatura;
		this.cursoImpartido = cursoImpartido;

	}

	//Definición de Getters y Setters
	public Curso getCursoImpartido(){

		return cursoImpartido;

	}

	public void setCursoImpartido(Curso cursoImpartido){

		this.cursoImpartido = cursoImpartido;

	}


	public String getNombreAsignatura(){

		return nombreAsignatura;

	}

	public void setNombreAsignatura(String nombreAsignatura){

		this.nombreAsignatura = nombreAsignatura;

	}


	public int getCodigoAsignatura(){

		return codigoAsignatura;

	}

	public void setCodigoAsignatura(int codigoAsignatura){

		this.codigoAsignatura = codigoAsignatura;

	}
}
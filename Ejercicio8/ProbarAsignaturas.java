package Ejercicio8;

import Ejercicio8.Asignaturas.*;

public class ProbarAsignaturas{

	public static void main(String[] args) {
		
		Asignaturas asig1 = new Asignaturas("Lenguajes de Marcas", 201, Curso.PRIMERO);
		Asignaturas asig2 = new Asignaturas("Desarrollo en entorno servidor", 221, Curso.SEGUNDO);

		System.out.println("La asignatura " + asig1.getNombreAsignatura() +
			", con el codigo " + asig1.getCodigoAsignatura() + ", se cursa en " +
			asig1.getCursoImpartido());

		System.out.println("La asignatura " + asig2.getNombreAsignatura() +
			", con el codigo " + asig2.getCodigoAsignatura() + ", se cursa en " +
			asig2.getCursoImpartido());

	}

}
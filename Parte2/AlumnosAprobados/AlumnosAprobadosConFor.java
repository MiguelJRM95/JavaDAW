public class AlumnosAprobadosConFor {
    
    public static void main(String[] args) {
        
        int totAprobados = 0;
        double nota;

        //Pasando argumentos por el metodo main

        for (String elemento : args){

            nota = Double.parseDouble(elemento);

            if (nota >= 5) {
                totAprobados++;
            }

        }
        System.out.println("El total de alumnos aprobados es " + totAprobados);
    }


}

package arreglos;
public class Arreglos3 {
    public static void main(String[] args) {
      double []calificaciones_prog = {18,19,15,16,17,10};
      double []calificaciones_bd={10,12,13,20,17,20};
      double []promedios = new double[6];
      for (int contador = 0;contador < calificaciones_bd.length;contador++){
          double suma = calificaciones_prog[contador] + calificaciones_bd[contador];
          double promedio = suma/2;
          //System.out.printf("Estudiante %d\t%f\t%f",contador,calificaciones_prog[contador],calificaciones_bd[contador]);
          promedios[contador]=promedio;
      }
      for (int contador=0;contador <calificaciones_bd.length;contador++){
          System.out.printf("Estudiante %d\tProgramacion: %.2f\t Bases de datos: %.2f\tPromedio: %.2f\n"
          ,contador+1,calificaciones_prog[contador],calificaciones_bd[contador],promedios[contador]);
      }
    }
}

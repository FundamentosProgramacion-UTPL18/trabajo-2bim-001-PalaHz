package arreglos;
public class Arreglos3 {
    public static void main(String[] args) {
        //Calificaciones
      double []calificaciones_prog = {18,19,15,16,17,10};
      double []calificaciones_bd={10,12,13,20,17,20};
        //Promedio
      double []promedios = new double[6];
        //Ciclo para ingresar promedios al arreglo "promedio"
      for (int contador = 0;contador < calificaciones_bd.length;contador++){
          double suma = calificaciones_prog[contador] + calificaciones_bd[contador];
          double promedio = suma/2;
          //System.out.printf("Estudiante %d\t%f\t%f",contador,calificaciones_prog[contador],calificaciones_bd[contador]);
          promedios[contador]=promedio;
      }
        //Encabezado
      System.out.printf("Estudiante\tProgramacion\tBases de datos\tPromedio\n");
        //Imprimir datos de la tabla
      for (int contador=0;contador <calificaciones_bd.length;contador++){
          System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n"
          ,contador+1,calificaciones_prog[contador],calificaciones_bd[contador],promedios[contador]);
      }
    }
}

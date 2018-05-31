package arreglos;
public class Arreglos2 {
    public static void main(String[] args) {
      int []arreglo = {1,2,3,4,5,6,7};
      for (int contador=0;contador < arreglo.length;contador++){
          if (arreglo[contador]% 2 == 0){
              System.out.println("//////////////////TABLA DEL "+arreglo[contador]+"/////////////////");
              for (int aux = 1;aux<=12;aux++){
                  System.out.printf("%d x %d = %d\n",arreglo[contador],aux,arreglo[contador]*aux);
              } 
          }
      }
    }
}

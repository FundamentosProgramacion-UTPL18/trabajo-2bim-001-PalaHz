package arreglos;
public class Arreglos {
    public static void main(String[] args) {
      int []c = new int[4];
      c[0]=10;
      System.out.print("Numero de elementos: "+c.length+"\n");
      for (int contador=0;contador < c.length;contador++){
          System.out.print(c[contador]+"\n");
      }
    }
}

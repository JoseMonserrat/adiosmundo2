public class AdiosMundo { // Clase principal
  public static void main (String[] args){
    String naranja = "\033[33m";
    String verde = "\033[32m";
	String reset = "\033[0m";
      System.out.println(naranja+"¡Adios mundo!"); //Imprime en naranja
      System.out.println(verde+"Pero... volveré"+reset); //Imprime en verde
  }
}


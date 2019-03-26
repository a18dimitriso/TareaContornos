import java.util.Scanner;

public class ConvertirAToneladas {
     public static void main(String[] args) {         

         double radio, area;         
         System.out.println("HALLA EL AREA DE UN CIRCULO");
         System.out.print("Ingresar el radio r = ");
         Scanner scanner = new Scanner(System.in);
         radio = scanner.nextFloat();
         area =  (3.14159*radio*radio);            
         System.out.println("Area = " + area);         
     }           
}
//A17BraisPG

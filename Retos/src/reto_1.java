import java.util.*;

public class reto_1 {
    public static void main(String[] args){


    int gradcelci;
    double formula=273.15;
    double result;
    int gram=130;
    double kilos;
    int valor=1000;

       
    Scanner myObj = new Scanner(System.in);

      
        System.out.println("La abuela necesita ayuda de convertir 350 grados C° a  grados K° AYUDEMOLA");  // Mostrar en pantalla
        System.out.println("Por favor Ingrese LOS GRADOS c° PARA PASARLOS A GRADOS KELVIN");
        gradcelci =myObj .nextInt(); 

     result=gradcelci+formula;
        

    System.out.println(gradcelci+" grados C° son "+ result + "  grados K°");  // Mostrar en panalla

    System.out.println("Ademas de esto tenemos que calcular cuantos kilogramos de harina necesita la abuela para la torta");
    System.out.println("Teniendo en cuenta que cada persona gasta 13 Gramos y son 10 personas ");
    kilos=gram/valor;

    System.out.println("cada persona gasta 13 gramos  y son 10 personas, los kilos que gasta en total la abuela para la torta son: "+ kilos+" Kilogramos ");  // Mostrar en panalla

    myObj.close();

  }
}

    
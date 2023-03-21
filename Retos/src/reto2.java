import java.util.*;
public class reto2 {
    public static void main(String[] args) {

    String doctor;
    String enfermera;
    double peso_bebe;
    int anos;
    double result_1;
    double result_2;
    double result_3;
    double result_4;
    int result6;
    int valor=12;
    int valor2=15;

   Scanner myObj = new Scanner(System.in);


    System.out.println("Por favor ingrese  el nombre del doctor");
    doctor =myObj .nextLine(); 

    System.out.println("Por favor ingrese  el nombre de la enfermera");
    enfermera =myObj .nextLine(); 


   


        System.out.println("Por favor inserte cuantos años tiene el bebe");
        anos=myObj .nextInt();

        System.out.println("Por favor inserte el peso del bebe");
        peso_bebe=myObj .nextDouble();
        
        result6=anos*valor;
        System.out.println("Su bebe tiene "+anos+" años, lo cual es meses son "+result6+" meses");
        result_1=peso_bebe+valor2;
        result_2=result6*10;
        result_3=result_1/result_2;
        result_4=result_3*8;

        System.out.println("EL doctor que atendio a su hijo fue "+doctor+" acompañado de su enfermara llamada "+enfermera+" y llegaron a la conclucion que necesita  " + result_4 + " dosis");


   

        myObj.close();
        
    }
}
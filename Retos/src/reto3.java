import java.util.*;

public class reto3 {
    
    public static void main(String[] args) {
    
        int apuesta;
        int contador;
        int jugador;
        
        Scanner myObj=new Scanner (System.in);

        for(contador=0; contador<5;contador++){
            int sellocara=(int)(Math. random()*2+1);
    System.out.println("Digite 1 en caso de que quiera elegir cara, digite 2 en caso de que quiera elegir sello");

    System.out.println("Cara o sello");
        jugador=myObj. nextInt();
        

    System.out.println("Cuanto va a aspostar");
    apuesta=myObj.nextInt();
    if (sellocara==jugador){
        System.out.println("Usted gano porque cayo"+ sellocara);
        apuesta=apuesta+apuesta;

    }
    else{

        System.out.println("Usted perdio porque cayo  "+ sellocara);
        apuesta=apuesta-apuesta;
    }


            
            contador=contador+1;

            System.out.println("EL DINERO QUE TIENE TRAS APOSTAR ES  "+apuesta);
            myObj.close();

 }



    }
    }
        

import java.util.*;

public class reto4 {
    
    public static void main(String[] args) {
    
        int apuesta;
        int contador;
        int jugador;
        
        Scanner myObj=new Scanner (System.in);

        for(contador=0; contador<5;contador++){
            int piedrapepeltijera=(int)(Math. random()*3+1);
            System.out.println("Digite 1 en caso de que quiera elegir piedra, digite 2 en caso de que quiera elegir papel,digite 3 en caso de tijeras");
            jugador=myObj. nextInt();
    
   
        

    System.out.println("Cuanto va a apostar");
    apuesta=myObj.nextInt();
    if(piedrapepeltijera==jugador){
        System.out.println("Empatados porque la maquina saco "+piedrapepeltijera);
    }
        else if(piedrapepeltijera<jugador){
            System.out.println("GANOO porque la maquina saco "+piedrapepeltijera);
            apuesta=apuesta+apuesta;
        
    }
    else if(piedrapepeltijera>jugador){
        System.out.println("perdio porque la maquina saco "+piedrapepeltijera);
        apuesta=apuesta-apuesta;
    
    }
    else{
        System.out.println("Dato erreoneo");
    }


            
            contador=contador+1;

            System.out.println("EL DINERO QUE TIENE TRAS APOSTAR ES  "+apuesta);
            myObj.close();

 }

    }

    }
        

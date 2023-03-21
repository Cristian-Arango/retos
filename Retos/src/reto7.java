import java.util.*;

public class reto7 {
    
    public static void main(String[] args) {
    

        int descicion=1;
        int apuesta;
        int jugador;
        int dinero;
        
        
        Scanner myObj=new Scanner (System.in);

        while(descicion==1){ 
            System.out.println("Perfecto iniciemos");
            int vidas=3;
            while(vidas>0){ 
                System.out.println("¿Usted con cuanto dinero cuenta?");
                dinero=myObj.nextInt();
            int piedrapepeltijera=(int)(Math. random()*3+1);
         System.out.println("Digite 1 en caso de que quiera elegir piedra, digite 2 en caso de que quiera elegir papel,digite 3 en caso de tijeras");

        System.out.println("¿PIEDRA-PAPEL-TIJERA");
        jugador=myObj. nextInt();
        
        
        System.out.println("Cuanto va a apostar");
        apuesta=myObj.nextInt();
        if(dinero>=apuesta){
            if(piedrapepeltijera==jugador){
                System.out.println("Empatados porque la maquina saco "+piedrapepeltijera+" y usted saco"+jugador);
                System.out.println("Le quedan "+vidas+" vidas");

            }
                else if(piedrapepeltijera<jugador){
                    System.out.println("GANOO porque la maquina saco "+piedrapepeltijera+" y usted saco"+jugador);
                    apuesta=apuesta+apuesta;
                    System.out.println("Le quedan "+vidas+" vidas");

            }
            else if(piedrapepeltijera>jugador){
                System.out.println("perdio porque la maquina saco "+piedrapepeltijera+" y usted saco"+jugador);
                apuesta=apuesta-apuesta;
                vidas=vidas-1;
                System.out.println("Le quedan "+vidas+" vidas");

            }
            else{
                System.out.println("Dato erreoneo");
            }
    
    
                
    
                System.out.println("EL DINERO QUE TIENE TRAS APOSTAR ES  "+apuesta);
        }
       
        else{
            System.out.println("Usted tiene poco dinero y quiere apostar mucho, no puede jugar");
            vidas=0;
        }
       
           

            
            
        }
        System.out.println("Si quiere jugar digite 1 en caos contrario digiteb 0");
        descicion=myObj.nextInt();
    }
    System.out.println("FIN DEL JUEGO");
    myObj.close();
}
}

import java.util.*;  //IMPORTAR EL PAQUETE 

public class reto6 {
    
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
                System.out.println("Usted con cuanto dinero cuenta?");
                dinero=myObj.nextInt();
            int sellocara=(int)(Math. random()*2+1);  //METODO PARA GENERAR NUMEROS "ALEATORIOS"
         System.out.println("Digite 1 en caso de que quiera elegir cara, digite 2 en caso de que quiera elegir sello");

        System.out.println("Cara o sello");
        jugador=myObj. nextInt();
        
        
        System.out.println("Cuanto va a apostar");
        apuesta=myObj.nextInt();
        if(dinero>=apuesta){
            if (sellocara==jugador){
                if(jugador==1){ 
                 System.out.println("Usted gano porque cayo "+ sellocara+" osea cara");
                apuesta=apuesta+apuesta;
                System.out.println("Le quedan "+vidas+" vidas");
    
            }
                else{
                    System.out.println("Usted gano porque cayo "+ sellocara+" osea  sello");
                    apuesta=apuesta+apuesta;
                    System.out.println("Le quedan "+vidas+" vidas");
                }
    
            }
            else{
                if(jugador==1){
    
                    System.out.println("Usted perdio porque cayo  "+ sellocara+" osea sello");
                    apuesta=apuesta-apuesta;
                    vidas=vidas-1;
                    System.out.println("Como usted perdio, pierde una vida le quedan "+ vidas+" vidas");
                }
                else{
                    System.out.println("Usted perdio porque cayo  "+ sellocara+" osea cara");
                apuesta=apuesta-apuesta;
                vidas=vidas-1;
                System.out.println("Como usted perdio, pierde una vida le quedan "+ vidas+" vidas");
       
            }
    
                
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

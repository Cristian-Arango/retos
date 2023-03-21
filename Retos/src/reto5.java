import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        
      int productos;
      String cliente;
      String empleadosregistrados="Cristian";
      String nombreemepleado;
      String nombreproducto;
      int subtotal=0;
      int valorproducto;
      int pago;
      int j=0;
      Scanner myObjt = new Scanner(System.in);


   System.out.println("este programa funciona para la tienda //COMPRA Baraquiño");
   while(j==0){ 

   System.out.println("Ingrese el nombre del empleado que va a registrar la compra");
    nombreemepleado=myObjt.next();

        if(nombreemepleado.equals(empleadosregistrados)){
            System.out.println("Ingrese el nombre del cliente");
            cliente=myObjt.next();

            System.out.println("Cuantos productos desea llevar señor/@ "+cliente );
            productos=myObjt.nextInt();
            for(int p=0;p<productos;p++){
                System.out.println("Nombre del producto a que desea llevar ");
                    nombreproducto=myObjt.next();
                        System.out.println("Digite que precio que tiene la/el "+nombreproducto);
                            valorproducto=myObjt.nextInt();
                                    subtotal=subtotal+valorproducto;
                                    


            }
            System.out.println("El valor de su compra es "+ subtotal+" pesos");
             System.out.println("Con cuanto va a cancelar señor/@ "+cliente);
                pago=myObjt.nextInt();
                if(pago<subtotal){
                    int operacion=0;
                    operacion=subtotal-pago;
                    System.out.println("Lo lamentamos le hacen falta "+operacion+" pesos señor/@ "+cliente);
                    }
                            else if(pago>subtotal){
                            int operacion2=0;
                            operacion2=pago-subtotal;
                            System.out.println("Perfecto sus vueltas son: "+operacion2+" pesos señor/@ "+cliente);
                
                            }
                
                                    else if(pago==subtotal){
                                        System.out.println("Perfecto usted pago exacto señor/@ "+cliente);
                                    }
                
                
                    else{
                        System.out.println("ERROR");
                    }

                        System.out.println("Perfecto finalizo todo el proceso, el empleado que lo atendio fue "+nombreemepleado+" usted llevo "+ productos + " Productos y su nombre es "+cliente);
                        j=1;



        }
        else{
            System.out.println("Lo lamentamos el empleado no esta registrado, vamos a registrarlo, Registre nuevamente el nombre del empleado que no esta registrado");
            empleadosregistrados=myObjt.next();
            j=0;
        }

    }

System.out.println("Fin");
myObjt.close();








    
    
}








}

 

        
        

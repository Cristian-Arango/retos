import java.util.*;

public class reto8 {
    
    public static void main(String[] args) {

    
        String ciclo;
        int i=0;
        String respuesta1;
        int respuesta2;
        String respuesta3;
        String respuesta4;
        String respuesta5;
        String respuesta6;
        Scanner myObj=new Scanner (System.in);

        
        ciclo="SI";

        System.out.println("este programa pertenece al servivio nacional de aprendizaje sena, porfavor Responda SI o NO (en mayusculas)");
        while(ciclo.equals("SI")){
            System.out.println("¿Esta matriculado en un Centro de Formación del SENA para cursar programas en los  niveles técnico o tecnológico en ciencias agropecuarias o afines, de los territorios establecidos en los seis Programas de Desarrollo Rural con Enfoque Territorial PDET, descritos en los estudios previos?");
            respuesta1=myObj.next();
            if(respuesta1.equals("SI")){
                System.out.println("Perfecto cumple el 1 requisito, CONTINUEMOS ");
                System.out.println("Cuantos años tiene");
                respuesta2=myObj.nextInt();
                if(respuesta2>13){
                    if(respuesta2<36){
                        System.out.println("perfecto cumple el 2 requisito, CONTINUEMOS, RECUERDE DECIR si O no ( EN MAYUSCULAS)");
                        System.out.println("¿Es colombiano?");
                        respuesta3=myObj.next();
                        if(respuesta3.equals("SI")){
                            System.out.println("Perfecto, continuemos, recuerde digitar SI o No (En mayusculas)");
                             System.out.println("¿Esta matriculado en un programa academico de educacion superior?");
                                respuesta4=myObj.next();
                                 if(respuesta4.equals("NO")){
                                     System.out.println("Perfecto cumple con el 4 requisito");
                                     System.out.println("Recuerde digitar SI o No (En mayusculas)");
                                     System.out.println("¿En este momento es beneficiario actual de otro programa para la financiación de subsidio bajo la modalidad de Apoyo en Sostenimiento para educación? ");
                                     respuesta5=myObj.next();
                                     if(respuesta5.equals("NO")){
                                        System.out.println("Perfecto continuemos");
                                        System.out.println("Recuerde digitar SI o No (En mayusculas)");
                                        System.out.println("¿Tiene cuenta bancaria?");
                                        respuesta6=myObj.next();
                                        if(respuesta6.equals("SI")){
                                            System.out.println("CUMPLE TODOS LOS REQUISITOS");
                                        }
                                        else if(respuesta1.equals("NO")){
                                            System.out.println("Lo lamentamos no puede recibir apoyo ");
                                        }
                                        else{
                                            System.out.println("DATO ERRONEO");
                                        }











                                     }
                                     else if(respuesta1.equals("SI")){
                                        System.out.println("Lo lamentamos no puede recibir apoyo ");
                                    }
                                    else{
                                        System.out.println("DATO ERRONEO");
                                    }





                                 }
                                 else if(respuesta1.equals("NO")){
                                    System.out.println("Lo lamentamos, no puede estar matriculado a educacion superior ");
                                }
                                else{
                                    System.out.println("DATO ERRONEO");
                                }

                      
                      
                      
                      
                      
                      
                      
                      
                      
                        }
                        else if(respuesta1.equals("NO")){
                            System.out.println("No cumple con los requisitos ");
                        }
                        else{
                            System.out.println("No cumple con los requisitos");
                        }














                    }
                    else{
                        System.out.println("No cumple con la edad, tiene que ser mayor a 14 años y menor a 37 y usted tiene "+respuesta2+" años");
                    }
                } 
                    else{
                        System.out.println("No cumple con la edad, tiene que ser mayor a 14 años y menor a 37 y usted tiene "+respuesta2+" años");   
                }








            }
            else if(respuesta1.equals("NO")){
                System.out.println("Lo lamentamos no cumple con el 1 requisito ");
            }
            else{
                System.out.println("DATO ERRONEO");
            }
            i=i+1;



            System.out.println("DESEA VERIFICAR SI OTRO APRENDIZ PUEDE RECIBIR APOYO ESCRIBA SI EN MAYUSCULA O EN CASO CONTRARIO NO");
            ciclo=myObj.next();

        }
        System.out.println("Perfecto usted registro  "+i+"  APrendices para saber si si podian recibir un apoyo");
        System.out.println("MUCHAS GRACIAS POR PREFERIRNOS");
        myObj.close();
    }
}
           
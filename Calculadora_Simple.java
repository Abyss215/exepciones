
/**
 * calculadora sencilla que lee una expresion y regresa el resultado
 * 
 * @Criss_215 (Cristian Rodriguez Venegas) 
 * @?? (a version number or a date)
 */
import java.util.Scanner;
public class Calculadora_Simple 
{
    //metodo principal
    public static void main(String [] args){
        System.out.println("en este programa podra ingresar una operacion(*,/,-,+) y le regresaremos el resultado");
        repetir();//llamando el metodo donde se procesara y se repetira en caso de pedirlo
    }
    
    private static void repetir(){
        Calcular cal=new Calcular();
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese su operacion"); 
        String txt=sc.nextLine();
        try{
            System.out.println(txt+"="+cal.resolver(txt));
        }catch(IllegalArgumentException e){//mensaje de error de la clase CadenaaNumero
            System.out.println(e.getMessage());
        }
        System.out.println("\n\ndesea realizar otra operacion? s/si/n/no");      //pregunta si quieres realizar otra operacion  
        txt =sc.nextLine();
        if(txt.equalsIgnoreCase("s")||txt.equalsIgnoreCase("si")) repetir();
    }
}

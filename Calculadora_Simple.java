
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
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
        System.out.println("="+resolver(txt));
    }
    ///separador de la expresion en las operaciones a hasta el momento
    private static double resolver(String txt){
        try{
            if (txt.contains("+"))return operacion(txt.split("\\+"),"+");
            else if(txt.contains("-"))return operacion(txt.split("-"),"-");
            else if(txt.contains("*"))return operacion(txt.split("\\*"),"*");
            else if(txt.contains("/"))return operacion(txt.split("/"),"/");
            else return Double.parseDouble(txt);        
        }catch(Exception e){
            if(txt.isBlank())System.out.println("valor vacio detectado(sera tomad como 0)");
            else System.out.println("caracter desconocido detectado,cambiando valor "+txt+" a 0");
            return 0;
        }
    }
    //resolvera la operacion con el valor ya separado y el operador encontrado
    private static double operacion(String[] arr,String o){
        
            double ope=resolver(arr[0]);
            for(int i=1;i<(arr.length);i++){
                if(o.equals("*")){ope=ope*resolver(arr[i]);}
                else if(o.equals("/")){ope=ope/resolver(arr[i]);}
                else if(o.equals("+")){ope=ope+resolver(arr[i]);}
                else if(o.equals("-")){ope=ope-resolver(arr[i]);}
            }
            return ope;
        
    }
    
}

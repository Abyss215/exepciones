
/**
 * Write a description of class Calcular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calcular
{
    public double resolver(String txt){//separador
        CadenaANumero convert=new CadenaANumero();
        //try{
            if (txt.contains("+"))return operacion(txt.split("\\+"),"+");
            else if(txt.contains("-"))return operacion(txt.split("-"),"-");
            else if(txt.contains("*"))return operacion(txt.split("\\*"),"*");
            else if(txt.contains("/"))return operacion(txt.split("/"),"/");
            else return convert.aDouble(txt); //tranformar el numero final a double
            /*{
                if () throw new IllegalArgumentException("valor deconocido detectado(sera tomad como 0)") ;
                else return convert.aDouble(txt);  
            }      
        /*}catch(Exception e){
            if(txt.isBlank())System.out.println("valor vacio detectado(sera tomad como 0)");
            else System.out.println("caracter desconocido detectado,cambiando valor "+txt+" a 0");
            return 0;
        }*/
    }
    //resolvera la operacion con el valor ya separado y el operador encontrado
    private double operacion(String[] arr,String o){
        
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

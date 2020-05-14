
/**
 * de string a numero sin parseDouble
 * 
 * @Criss_215 (your name) 
 * @version (a version number or a date)
 */
public class CadenaANumero
{
    public double aDouble(String a){////de string a double
        int m=1,sig=1;
        double x=0;
        for(int i=a.length()-1;i>=0;i--){
            int p=0;
            switch (a.charAt(i)){
                case '0': 
                    break;
                case '1': p=1;
                    break;
                case '2': p=2;
                    break;
                case '3': p=3;
                    break;
                case '4': p=4;
                    break;
                case '5': p=5;
                    break;
                case '6': p=6;
                    break;
                case '7': p=7;
                    break;
                case '8': p=8;
                    break;
                case '9': p=9;
                    break;
                case '-': sig=-1; p=15;
                    break;
                case '.': x=x/m; m=1; p=15;
                    break;
                default: throw new IllegalArgumentException("valor deconocido detectado\nevite uso de letras y caracteres especiales no admitidos por ahora");
            }
            if(!(p==15)){x=x+p*m; m=m*10;}
             
        }
        return sig*x;
    }
    public int aEntero(String a){////de string a int
        int x=0, m=1,sig=1;
        for(int i=a.length()-1;i>=0;i--){
            int p=0;
            switch (a.charAt(i)){
                case '0': 
                    break;
                case '1': p=1;
                    break;
                case '2': p=2;
                    break;
                case '3': p=3;
                    break;
                case '4': p=4;
                    break;
                case '5': p=5;
                    break;
                case '6': p=6;
                    break;
                case '7': p=7;
                    break;
                case '8': p=8;
                    break;
                case '9': p=9;
                    break;
                case '-': sig=-1; p=15;
                    break;
                default: p=15;
            }
            if(!(p==15)){x=x+p*m; m=m*10;}
             
        }
        return sig*x;
    }
}

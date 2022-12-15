public class SelectOperation{
public static void main(String[] args) {

     String  calculate = mathFunction(1, 2, 3);
     String calculate2 = mathFunction(3, 2, 1);
     String calculate3 = mathFunction(-3, 2, -6);

     String calculate4 = mathFunction(1, 2, 7);
     String calculate6 = mathFunction(0, 0, 0);

     String calculate5 = mathFunction(2, 2, 4);

    
}

public static String mathFunction(int Number1, int Number2, int Number3 ){

    if (((Number1 * Number2) == Number3) && ((Number1 + Number2) ==Number3)&&(Number1- Number2 == Number3)){
        return "*, + and - ";
    }
    if (((Number1 * Number2) == Number3) && ((Number1 / Number2) ==Number3)){
        return "* and /";
    }
    if (((Number1 + Number2) == Number3) && ((Number1 * Number2) ==Number3)){
        return "+ and *";
    }
    if ((Number1 + Number2 )== Number3){
        return "+";
    } 
   if((Number1 - Number2) == Number3){
        return "-";
   }
    if((Number1 * Number2) ==Number3){
         return "*";
  
     }   
   if((Number1 / Number2) ==Number3){
   return "/";

    }else{
     return "none";
}
 }
}


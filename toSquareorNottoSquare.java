import java.util.*;

public class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
  
    int[] res= new int[array.length];
    
    for(int i=0;i<array.length;i++){
     
       if(Math.ceil(Math.sqrt(array[i])) == Math.floor(Math.sqrt(array[i]))){
          res[i]=(int) Math.sqrt(array[i]);
       }else{
          res[i]=(int) Math.pow(array[i],2);
       }
    
    }
    
    return res;
  }
}

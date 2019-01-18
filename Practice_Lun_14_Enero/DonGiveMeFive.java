public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
  
  int res=0;
  String val="5";
  for(int temp=start;temp<=end;temp++){
     String fuly=String.valueOf(temp);
     if(!fuly.contains(val)){
        res++;
     }
  
  }
    return res;
 }
}

import java.util.*;
public class hashkey {
   public static void main(String args[]){
    HashMap<String,String> a=new HashMap<>();
    a.put("ano","01");
    a.put("sname","muraja");
    System.out.println(a);
if(a.containsKey("sname"))
{
    String d=a.get("sname");
    System.out.println(d);
} 

}
}
 

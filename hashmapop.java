import java.util.*;
public class hashmapop {
    public static void main(String args[])
    {
        HashMap<String,String> a=new HashMap<>();
        a.put("sno","01");
        a.put("sname","muraji");
        a.put("city","chennai");
        System.out.println(a);
        //modifying value for a key
        a.put("sno","90");
        System.out.println(a);
        //removing key
        a.remove("sname");
        System.out.println(a);
        //clearing the hashmap
        a.clear();
        System.out.println(a);
    }
    
}

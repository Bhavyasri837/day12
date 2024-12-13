import java.util.*;

public class differencestr {
        public static void main(String args[])
    {  
        String str1[]={"bhavya","divya","kavya","navya"};
        String str2[]={"bhavya","hema","divya","thosh","bindu"};
        Set<String> a=new HashSet<>();
        Set<String> b=new HashSet<>();
        for(String s1:str1)
        {
            a.add(s1);
        }
        for(String s2:str2)
        {
            b.add(s2);
        }
        System.out.println(a); 
        System.out.println(b);
        Set c=new HashSet<>(a);
        c.removeAll(b);
        System.out.println(c);
    }
} 



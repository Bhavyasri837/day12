import java.util.*;
public class unionstr {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String str1[]=new String[n];
        String str2[]=new String[m];
        for(int i=0;i<n;i++)
        {
            str1[i]=sc.nextLine();
        }
        for(int i=0;i<m;i++)
        {
            str2[i]=sc.nextLine();
        }
        for(String s1:str1){
        System.out.println(s1);
        }
        for(String s2:str2){
        System.out.println(s2);
        }
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
        c.addAll(b);
        System.out.println(c);
    }
    
}

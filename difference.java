import java.util.*;
public class difference {
       public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[m];
    for(int i=0;i<n;i++)
    {
        arr1[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++)
    {
        arr2[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
   Set<Integer> a=new HashSet<>();
   Set<Integer> b=new HashSet<>();
   for(int s1:arr1)
   {
    a.add(s1);
   }
   for(int s2:arr2)
   {
    b.add(s2);
   }
   System.out.println(a);
   System.out.println(b);
   Set<Integer> c=new HashSet<>(a);
   c.removeAll(b);
   System.out.println(c);
}

}




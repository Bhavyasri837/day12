import java.util.*;
public class linkedlist
{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("hello");
        a.add("hi");
        a.add("how");
        a.add("are u");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
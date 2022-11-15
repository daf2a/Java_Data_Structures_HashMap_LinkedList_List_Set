package linkedlist;

/**
 *
 * @author Muhammad Daffa Ashdaqfillah
 */
import java.util.LinkedList;

public class Linkedlist14 {
    public static void main(String[] args){
        LinkedList<String> Stack = new LinkedList<>();
        Stack.push("Daffa");
        Stack.push("Kevin");
        Stack.push("Haidar");
        Stack.push("Kirana");
        Stack.push("Hary");
        
        int idx=0;
        while(!Stack.isEmpty())
            System.out.println("Stack " + idx++ + " : " + Stack.pop());
        
        System.out.println();
        LinkedList<String> Queue = new LinkedList<>();
        Queue.add("Daffa");
        Queue.add("Kevin");
        Queue.add("Haidar");
        Queue.add("Kirana");
        Queue.add("Hary");
        
        idx=0;
        while(!Queue.isEmpty())
            System.out.println("Queue " + idx++ + " : " + Queue.removeFirst());
        
        String str1 = "Daffa";
        String str2 = "Dave";
        String str3 = "Daffa";
        
        System.out.println();
        if(str1.compareTo(str2)!=0)
            System.out.println("String 1 dan 2 berbeda");
        else if (str1.compareTo(str2)==0)
            System.out.println("String 1 dan 2 sama");
        
        if(str1.compareTo(str3)!=0)
            System.out.println("String 1 dan 2 berbeda");
        else if (str1.compareTo(str3)==0)
            System.out.println("String 1 dan 2 sama");
    }
}

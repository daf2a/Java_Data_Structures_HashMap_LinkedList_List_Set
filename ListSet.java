package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author asus
 */
public class list14 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Daffa");
        list.add("Haidar");
        list.add("Arifin");
        list.add("Royyan");
        list.add("Haidar");
        
        Set<String> set = new HashSet<>();
        set.add("Daffa");
        set.add("Haidar");
        set.add("Arifin");
        set.add("Royyan");
        set.add("Haidar");
        
        System.out.println("List = " + list);
        System.out.println("Set = " + set);
        
        list.remove(0);
        set.remove(0);
        
        System.out.println();
        System.out.println("List = " + list);
        System.out.println("Set = " + set);
        
        list.add(0, "Tarisa");
        
        System.out.println();
        System.out.println("List = " + list);
        System.out.println("Set = " + set);
        
        System.out.println();
        System.out.println("Tarisa ada di set? " + set.contains("Tarisa"));
        System.out.println("Haidar ada di set? " + set.contains("Haidar"));
        
        System.out.println();
        System.out.println("Set Kosong? " + set.isEmpty());
        set.removeAll(set);
        System.out.println("Set Kosong? " + set.isEmpty());
    }
    
}

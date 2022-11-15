package map;

/**
 *
 * @author Muhammad Daffa Ashdaqfillah
 */

import java.util.HashMap;

public class map14 {
    public static void main(String[] args){
        HashMap<String,String> Kamus = new HashMap<>();
        addElements("Kursi", "Chair", Kamus);
        addElements("Meja", "Table", Kamus);
        addElements("Kipas", "Fan", Kamus);
        addElements("Celana", "Pants", Kamus);
        addElements("Baju", "Shirt", Kamus);
        
        displayElements(Kamus);
        
        System.out.println();
        getValue("Baju", Kamus);
    }
    
    public static void getValue(String key, HashMap<String, String> Kamus){
        if(Kamus.get(key)==null)
            System.out.println("eror");
        else
            System.out.println(Kamus.get(key));
    }
    
    public static void displayElements(HashMap<String,String> Kamus){
        for(HashMap.Entry<String, String> Translate : Kamus.entrySet())
            System.out.println("Indonesia : " + Translate.getKey()
                                + "\tTranslate : " + Translate.getValue());
    }

    private static void addElements(String key, String value, HashMap<String, String> Kamus) {
        Kamus.put(key, value);
    }
    
}

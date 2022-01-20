import java.util.Arrays;
import java.util.HashMap;

/**
 * HASH TABLE IMPLEMENTATION
 * JINGXIANG MO
 * 2022-01-20
 */

public class HashTable {

    public static void main(String[] args){

        /* ==========[ BASIC HASHMAP IMPLEMENTATION ]========== */

        int a = 10;
        int b = 3;
        int c = 88;

        HashMap <String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy);

        /* ===========[ ADVANCED HASHMAP IMPLEMENTATION ]========== */

        HashMap<String, String> fun = new HashMap<>();
        fun.put("bobbyJoe1996", "Hellothere");
        fun.put("dragonslayer9999", "Hellother3");
        fun.put("hell", "no");
        fun.remove("hell");
        fun.replace("bobbyJoe1996", ";lkasdjfklasdlk");

        System.out.println(fun.containsValue("Hellother3"));
        System.out.println(fun.values());
        System.out.println(fun);

    }
}

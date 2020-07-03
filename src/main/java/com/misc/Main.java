package com.misc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.HashMap;
import java.util.Map;

// "static void main" must be defined in a public class.
public class Main {

    public static void main(String[] args) {
        int c = 12;
        HashMap b = new HashMap();
        b.put("c", c);
        HashMap a = new HashMap();
        a.put("b", b);
        HashMap obj = new HashMap();
        obj.put("a", a);
        
        // System.out.println(obj);
        // obj = {
        //     a: {
        //         b: {
        //             c: 12
        //         }
        //     }
        // };

      //  System.out.print(obj);
        
       System.out.println(findPath(obj, "a.b.c")); // 12
      System.out.println(findPath(obj, "a.b")); // {c: 12}
     System.out.println(findPath(obj, "a.b.d")); // null
    System.out.println(findPath(obj, "a.c")); // null
        System.out.println(findPath(obj, "a.b.c.d")); // null
        System.out.println(findPath(obj, "a.b.c.d.e")); // null

    }
    

    public static Object findPath(HashMap obj, String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        String[] path1 = path.split("\\.");
        Object o = obj;
        for(int i=0;i<path1.length;i++){

            if(o instanceof Integer){
                return null;
            }

            Map<String, Object> m = objectMapper.convertValue(o, Map.class);
            if(!m.containsKey(path1[i])){
            return null;
            }
            else{
                o = m.get(path1[i]);
            }
             }
         return o;
    }

}
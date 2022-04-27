package maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

    public static Map<Integer,String> myMap(){
        Map<Integer,String> sinifList=new HashMap<>();
        sinifList.put(101,"Ali, Can, Java, 2010");
        sinifList.put(102,"Veli, Yan, C#, 2011");
        sinifList.put(103,"Ali, Yan, Python, 2005");
        sinifList.put(104,"Ayse, Kan, Java, 2000");
        sinifList.put(105,"Fatma, Han, C#, 2002");

        return sinifList;

    }
}

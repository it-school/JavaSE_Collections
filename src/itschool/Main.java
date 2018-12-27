package itschool;

import com.custom_Collections.CustomList;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//CustomList test
        CustomList customList = new CustomList();
        for (int i=0;i<10;i++){
            customList.add(i);
        }
        System.out.println(customList);
        System.out.println("test get "+customList.get(8));
        customList.remove(5);


//CustomMap test
        com.hash_map_test.CustomMap<String,Integer> customMap=new com.hash_map_test.CustomMap();
        customMap.put("Test1",10);
        customMap.put("Test2",12);

//HashMap test
        HashMap hashMaTest = new HashMap<String, Integer>();
        hashMaTest.put("micro", 1234566);
        hashMaTest.put("micro2", 1234567);
        hashMaTest.put("micro3", 1234568);
        hashMaTest.put("micro4", 1234569);
        hashMaTest.put("micro5", 12345610);
        hashMaTest.put("micro6", 12345611);
        hashMaTest.put("micro6", 1111111111);

        System.out.println(hashMaTest.get("micro6"));
//        System.out.println(hashMaTest.get("micro3"));
//        System.out.println(hashMaTest.get("micro4"));
//        System.out.println(hashMaTest.get("micro5"));
//        System.out.println(hashMaTest.get("micro2345"));
    }
}

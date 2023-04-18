package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {

    public void LinkedListExample01() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Heng Swee Keat");
        linkedList.add("Leong Mun Wai");
        linkedList.add("Pritam Singh");
        linkedList.add("Gerald Giam");

        // System.out.println(linkedList);

        for (String item: linkedList){
            System.out.println(item);
        }

        linkedList.remove("Leong Mun Wai");
        System.out.println(linkedList);

        linkedList.addFirst("Lee Hsien Loong");
        linkedList.addLast("LKY");
        System.out.println(linkedList);


    }
    
}

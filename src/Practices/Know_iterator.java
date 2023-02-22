package Practices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Know_iterator {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("How");
        list.add("You");

        list.add(2, "Arre");
        list.set(0, "Hi");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

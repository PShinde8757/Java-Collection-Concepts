import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> guestlist = new  LinkedList<>();

        guestlist.add("pratik");
        guestlist.add("sagar");
        guestlist.add("ashwin");
        guestlist.add("xyz");

        guestlist.forEach(name-> System.out.println(name));
        System.out.println();


        System.out.println("Removing 4th Index Of List: "+guestlist.remove(3));
        System.out.println();

        System.out.println("Getting 2nd Index Of List: "+ guestlist.get(1));
        System.out.println();
        List<String> guestlist2 =new LinkedList<>();

        guestlist2.add("aditi");
        guestlist2.add("priya");
        guestlist2.add("prajkta");
        guestlist2.add("neha");

        guestlist.addAll(guestlist2);

        System.out.println("****** Adding new List *****");
        guestlist.forEach(name-> System.out.println(name));

        System.out.println();

        System.out.println("****** Sorting new List *****");
        Collections.sort(guestlist);
        guestlist.forEach(name-> System.out.println(name));

    }
}
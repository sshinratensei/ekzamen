package Project2;

import java.util.LinkedList;

public class Mainz {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("A", "B", 30);
        Person p2 = new Person("c", "d", 20);
        Person p3 = new Person("e", "f", 40);

        System.out.println("Эти объекта равны друг другу?");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p1));

        System.out.println("Какие у них хэш-коды?");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        LinkedList<Person> people = new LinkedList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        if(p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
            throw new Exception();
        }
        for (Person s : people) {
            System.out.println(s);
        }
    }
}

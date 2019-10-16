import com.google.common.collect.Lists;

import java.util.ArrayList;

public class MyAPI {

    public static void main(String[] args) {
        ArrayList<Person> persons = Lists.newArrayList(new Person("Ada"), new Person("Ray"));
        persons.forEach(System.out::println);
    }
}

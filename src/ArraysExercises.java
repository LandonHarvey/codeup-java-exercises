import java.lang.reflect.Array;
import java.util.Arrays;
import util.Input;

public class ArraysExercises {
    public static Person[] addPerson (Person[] array, String person) {
        Person[] newArray = Arrays.copyOf(array, array.length+1);
        System.out.println(newArray.length);
        newArray[newArray.length-1] = new Person(person);
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] Persons = new Person[3];
        int i = 0;
        do {
            Persons[i] = new Person(Input.getString("What is your name?"));
            i++;
        }while (i < Persons.length);

        for (Person p: Persons) {
            System.out.println(p.getName());
        }
        addPerson(Persons, "Bob");
    }
}

package task01.reader;

import task01.core.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vaas on 11.11.2015.
 */
public class Reader {
    //list. not array
    private List<Person> persons;
    private String path;

    public Reader(List<Person> persons, String path) {
        this.persons = persons;
        this.path = path;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    //return, not void
    public void readFromFile() throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new
                ObjectInputStream((new FileInputStream(path)))) {
            for (Person person : persons) {
                person = (Person) objectInputStream.readObject();
            }
        } catch (IOException e) {
            System.out.print("IOException: " + e.toString());
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException: " + e.toString());
        }
    }
}

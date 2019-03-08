package testing.advancedclasses;

/**
 *
 * @author n.hacault
 */
public class Person {
    private String name;
    public int age;
    
    public Person() {
        name = "Ya boi";
        age = 0;
    }
    
    public void talk() {
        System.out.println(name + " = " + age);
    }
}

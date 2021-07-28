
package semana3;

public class Faculty extends Employee {

    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty() {
        System.out.println("(*) Performs Faculty's tasks");
    }
}

class Employee extends Person {

    public Employee() {
        this("(*) Invoke Employee's overloaded constructor");
        System.out.println("(*) Performs Employee's tasks");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}

class Person {

    public Person() {
        System.out.println("(*) Performs Person's tasks");
    }
}

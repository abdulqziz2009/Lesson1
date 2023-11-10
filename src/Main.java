import java.util.Scanner;

import static java.lang.Character.getName;

abstract class AbstractParent {
    private String name;
    private int age;

    public AbstractParent(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным.");
        }
    }

    public int getAge() {
        return age;
    }

    public abstract void uniqueMethod();

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}




final class NonInheritable {
    private String name;

    public NonInheritable(String name) {
        this.name = name;
    }

    public void uniqueMethod() {
        System.out.println(name + " is a non-inheritable class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child1 child1Instance = new Child1("Имя первого ребенка Maxsim.", 25, "Property1Value");
        Child2 child2Instance = new Child2("Имя второго ребёнка Sasha.", 30, "Property2Value");
        NonInheritable nonInheritableInstance = new NonInheritable("NonInheritableName");

        child1Instance.printInfo();
        child1Instance.uniqueMethod();

        child2Instance.printInfo();
        child2Instance.uniqueMethod();

        nonInheritableInstance.uniqueMethod();
    }
}

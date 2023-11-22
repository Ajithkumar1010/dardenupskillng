package day1;
class Animal1{
    public void eat() {

        System.out.println("I can eat");
    }
}

class Dog1 extends Animal1 {

    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food");
    }

    public void bark() {

        System.out.println("I can bark");
    }
}
public class MethodOverriding2 {
    public static void main(String[] args) {
        Dog1 labrador = new Dog1();
        labrador.eat();
        labrador.bark();
    }
}


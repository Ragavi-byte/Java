package abstraction;

import encapsulation.Person1;

public class Animal extends Person1{
    static void main() {
        Animal a = new Animal();
        a.address="TN";
        a.age=21;
        System.out.println(a.address+" "+a.age);
    }
}


package encapsulation;

import abstraction.Animal;

public class Main {
    static void main() {
        Person1 p2=new Person1();
        Person1 p1 = new Person1(21, "Ragavi", "TamilNadu");
        System.out.println(p1.getAge() + "," + p1.getName() + "," + p1.getAddress() + ",");
        p1.setName("Ragavi");
        System.out.println(p1.getName());
        p1.age=25;
        System.out.println(p1.getAge() + "," + p1.getName() + "," + p1.getAddress() + ",");
        p1.setAddress("nepal" );
        System.out.println(p1.getAddress());
        System.out.println(p1.getAge() + "," + p1.getName() + "," + p1.getAddress() + ",");
//        Animal a1=new Animal(90, "elephant", "jungle");
//        System.out.println(a1.getAge() + "," + a1.getName() + "," + a1.getAddress() + ",");
    }
}


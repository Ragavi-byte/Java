package tasks;
public class main {
    static void main() {
        vehicle v1=new car(4);
        vehicle v2=new car(5);
        v1.display();
        v2.display();
        vehicle v3=new bike(6);
        vehicle v4=new bike(0);
        vehicle a1=new vehicle("red",120);
        a1.display();
    }
}



package tasks;

public class car extends vehicle{
    int door;

    public car(int door) {
        this.door = door;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
    void display(){
        System.out.println("Door: " + door);
    }
}


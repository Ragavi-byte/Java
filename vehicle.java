package tasks;

class vehicle{
    String colour;
    int speed;

    vehicle(){}

    public vehicle(String colour, int speed) {
        this.colour = colour;
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    void display(){
        System.out.println("colour:"+colour);
        System.out.println("speed:"+speed);
    }
}

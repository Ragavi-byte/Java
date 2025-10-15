package tasks2;

class Rectangle extends shape{
    public Rectangle(int radius,int length){
        this.radius=radius;
        this.length=length;
    }
     double calculateArea(){
        double area=4*3.14*radius;
        System.out.println("rectangle area:"+area);
        return area;
    }
}

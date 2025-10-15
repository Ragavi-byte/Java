package tasks2;

class Circle extends shape {
    public Circle(int radius) {
        this.radius = radius;
    }
     double calculateArea() {
         double area = 3.14 * radius * radius;
         System.out.println("Area of circle is :" + area);
         return area;
     }
    }





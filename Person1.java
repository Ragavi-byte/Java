package encapsulation;

public class Person1 {
    public int age;
    private String name;
    protected String address;
    public Person1()
    {
        System.out.println(age+","+name+","+address);
    }
    public Person1(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


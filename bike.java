package tasks;
public class bike extends vehicle{
    int helmets;

    public int getHelmets() {
        return helmets;
    }

    public void setHelmets(int helmets) {
        this.helmets = helmets;
    }

    public bike(int helmets) {
        this.helmets = helmets;
        if(helmets>0){
            System.out.println("safety provided");
        }else{
            System.out.println("safety not provided");
        }

    }
}



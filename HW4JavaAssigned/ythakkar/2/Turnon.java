public class Turnon implements Command{

    public void execute(){
        System.out.println("Turning on the TV");
    }

    public String name(){return "Turnon";}
}
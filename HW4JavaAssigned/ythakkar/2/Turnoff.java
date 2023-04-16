public class Turnoff implements Command{

    public void execute(){
        System.out.println("Turning off the TV");
    }

    public String name(){return "Turnoff";}
}
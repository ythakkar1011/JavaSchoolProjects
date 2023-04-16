public class Turnup implements Command{

    public void execute(){
        Remote.volume += 1;
        System.out.println("Volume turned up to "+Remote.volume);
    }

    public String name(){return "Turnup";}
}
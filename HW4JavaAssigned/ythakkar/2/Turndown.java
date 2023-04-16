public class Turndown implements Command{

    public void execute(){
        Remote.volume -= 1;
        System.out.println("Volume turned down to "+Remote.volume);
    }

    public String name(){return "Turndown";}
}
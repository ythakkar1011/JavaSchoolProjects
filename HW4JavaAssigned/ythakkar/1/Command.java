public abstract class Command{

    abstract void execute();

    abstract String name();

}

class Turnon extends Command{

    void execute(){
        System.out.println("Turning on the TV");
    }

    String name(){return "Turnon";}
}

class Turnoff extends Command{

    void execute(){
        System.out.println("Turning off the TV");
    }

    String name(){return "Turnoff";}
}

class Turnup extends Command{

    void execute(){
        Remote.volume += 1;
        System.out.println("Volume turned up to "+Remote.volume);
    }

    String name(){return "Turnup";}
}

class Turndown extends Command{

    void execute(){
        Remote.volume -= 1;
        System.out.println("Volume turned down to "+Remote.volume);
    }

    String name(){return "Turndown";}
}


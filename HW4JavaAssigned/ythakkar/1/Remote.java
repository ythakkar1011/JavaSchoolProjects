public class Remote {

    private static Remote uniqueInstance = null;
    private Remote() {slots = new Command[5];}
    private Command[] slots;
    public static int volume = 0;

    public static Remote buildRemote(){
        if (uniqueInstance == null) {
            uniqueInstance = new Remote();
        }
        return uniqueInstance;
    }

    public void addCommand (int s, Command command) {
        slots[s] = command;
    }

    public void removeCommand(int s){
        if (s >= 5){
            System.out.println("Remote has slots 0..4, you've asked to remove a command from slot "+s);
        }
        else if (slots[s] == null){
            System.out.println("Remote slot " + s + " does not have a command");
        }
        else {
            slots[s] = null;
        }
    }

    public void executeCommand(int s){
        if (s >= 5){
            System.out.println("Remote has slots 0..4, cannot execute a command in slot "+s);
        }
        else if (slots[s] == null){
            System.out.println("Remote slot "+ s + " does not have a command to execute");
        }
        else {
            slots[s].execute();
        }
    }

    public String toString(){
        String array[];
        array = new String[5];
        for (int i=0; i<5; i++) {
            if (slots[i] == null){
                array[i] = " no command\n";
            }
            else{
                array[i] = " the "+slots[i].name()+" command\n";
            }
        }

        return "Remote:\n" + "slot 0 contains" + array[0] + "slot 1 contains" + array[1] + "slot 2 contains" + array[2] + "slot 3 contains" + array[3] + "slot 4 contains" + array[4];
    }
}


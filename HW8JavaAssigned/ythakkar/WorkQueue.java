import java.util.ArrayList;

public class WorkQueue {

    private ArrayList <Command> list;

    public WorkQueue(){
        list = new ArrayList<Command>();
    }
    public synchronized void put(Command add){
        list.add(add);
    }

    public synchronized Command get() {
        if (list.isEmpty()) {
            return null;
        }

        return list.remove(0);
    }


}

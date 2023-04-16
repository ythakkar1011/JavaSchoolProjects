public class PekinDuck extends Duck{

    public PekinDuck( ) {
        flyBehavior = new FlysPoorly( );
        quackBehavior = new Quack( );
        eggBehavior = new LaysEggsNotBroody( );
    }

    public void display( ) {
        System.out.println("I'm a pekin duck");
    }
}

public class MallardDuck extends Duck {
   
public MallardDuck( ) {
      quackBehavior = new Quack( );
      flyBehavior = new FlyWithWings( );
      eggBehavior = new LaysEggsBroody( );
   }
   
   public void display( ) {
      System.out.println("I'm a real mallard duck");
   }
}

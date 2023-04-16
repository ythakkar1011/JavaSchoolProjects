public class RedHeadDuck extends Duck {
   public RedHeadDuck( ) {
      quackBehavior = new Quack( );
      flyBehavior = new FlyWithWings( );
      eggBehavior = new LaysEggsBroody( );
   }

   public void display( ) {
      System.out.println("I'm a real redheaded duck");
   }
}

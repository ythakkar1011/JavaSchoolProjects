public class DecoyDuck extends Duck {

   public DecoyDuck( ) {
      flyBehavior = new FlyNoWay( );
      quackBehavior = new MuteQuack( );
      eggBehavior = new DoesNotLayEggs( );
   }

   public void display( ) {
      System.out.println("I'm a decoy duck");
   }
}

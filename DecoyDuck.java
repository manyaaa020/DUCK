public class DecoyDuck extends Duck{
    public DecoyDuck(){
        swimBehaviour=new Floating();
        flyBehaviour=new Notfly();
    }
    @Override
    public void display() {
        System.out.println("  I am Decoy duck");

    }
}

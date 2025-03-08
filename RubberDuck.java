//RubberDuck.java
public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior=new Squeak();
        swimBehaviour=new Floating();
        flyBehaviour=new Notfly();
    }
    @Override
    public void display() {
        System.out.println("  I am rubber duck");

    }
}

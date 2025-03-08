// MallardDuck.java
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior=new Quack();
        swimBehaviour=new Swimming();
        flyBehaviour = new Fly();
    }
    @Override
    public void display() {
        System.out.println("I am mallard duck");
    }

}

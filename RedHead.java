// RedHead.java
public class RedHead extends Duck{
    public RedHead(){
        quackBehavior=new Quack();
        swimBehaviour=new Swimming();
        flyBehaviour = new Fly();
    }
    @Override
    public void display() {
        System.out.println("I am redhead duck");
    }


}

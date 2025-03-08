// Duck.java
abstract public class Duck {
    QuackBehavior quackBehavior;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    abstract  public void display();

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performSwim(){
        swimBehaviour.swim();
    }

    public void performFly(){
        flyBehaviour.fly();
    }



}
